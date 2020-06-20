# -*- coding: utf-8 -*-
import xml.etree.ElementTree as ET
import matplotlib.pyplot as plt

import numpy as np
from matplotlib import cm
from bokeh.plotting import *
from bokeh.models import *
from bokeh.models import WMTSTileSource
from bokeh.tile_providers import *
import bokeh
from sklearn.preprocessing import MinMaxScaler
import random
import math
import codecs

#Encontrar los lugares
def obtenerNombre(way):
        tags = way.findall('tag')
        for tag in tags:
                if tag.get('k') == u'name':
                         return tag.get('v')
        return ""

def encontrarNombre(ways, nombre):
        for way in ways:
                tags = way.findall('tag')
                for tag in tags:
                        if tag.get('k') == u'name' and tag.get('v') == nombre:
                                 return way

def encontrarNodo(nodes, nodoID, nombre):
        for node in nodes:
                if node.get('id') == nodoID:
                        return node.get('lon'), node.get('lat'), nodoID, nombre

def encontrarUrbanizaciones(ways):
        urbanizaciones = []
        for way in ways:
                tags = way.findall('tag')
                for tag in tags:
                        if tag.get('k') == u'landuse' and tag.get('v') == 'residential':
                                nodoID = list(way)[0].get('ref')
                                nodo = encontrarNodo(nodes,nodoID,obtenerNombre(way))
                                if nodo != None:
                                        urbanizaciones += [nodo]
        return urbanizaciones

#Dibujar el mapa
def latlng_to_meters(lat, lng):
    origin_shift = 2 * np.pi * 6378137 / 2.0
    mx = lng * origin_shift / 180.0
    my = np.log(np.tan((90. + lat) * np.pi / 360.0)) / (np.pi / 180.0)
    my = my * origin_shift / 180.0
    return mx, my


def plot_map(lat, lon, color=None, size=10):
    center = [lat[0],lon[0]]
    cmap = cm.rainbow 
    wlat, wlong = latlng_to_meters(lat, lon)
    colors = []
    if color is not None:
        colors = MinMaxScaler(feature_range=(0,255)).fit_transform(color)
        colors = ["#%02x%02x%02x"%tuple([int(j*255) for j in cmap(int(i))[:3]]) for i in colors]
    wlat0, wlong0 = latlng_to_meters(center[0], center[1])
    wlat = np.append(wlat, wlat0)
    wlong = np.append(wlong, wlong0)
    colors.append('#010002')
    openmap_url = 'http://c.tile.openstreetmap.org/{Z}/{X}/{Y}.png'
    otile_url = 'http://otile1.mqcdn.com/tiles/1.0.0/sat/{Z}/{X}/{Y}.jpg'
    TILES = WMTSTileSource(url=openmap_url)
    tools="pan,wheel_zoom,reset"
    p = figure(tools=tools, plot_width=700,plot_height=600, x_axis_type="mercator", y_axis_type="mercator")
    p.circle(wlat0, wlong0, color = '#dc3826', size = size+10)
    p.circle(np.array(wlat), np.array(wlong), color=colors, size=size, alpha = 0.5)
    p.add_tile(TILES)
    p.axis.visible = False
    pb = gridplot([[p]])
    show(pb)

#Calcular los caminos más cortos
def read_osm(filename_or_stream, only_roads=True):
    """Read graph in OSM format from file specified by name or by stream object.
    Parameters
    ----------
    filename_or_stream : filename or stream object
    Returns
    -------
    G : Graph
    Examples
    --------
    >>> G=nx.read_osm(nx.download_osm(-122.33,47.60,-122.31,47.61))
    >>> plot([G.node[n]['data'].lat for n in G], [G.node[n]['data'].lon for n in G], ',')
    """
    osm = OSM(filename_or_stream)
    G = networkx.Graph()

    for w in osm.ways.itervalues():
        if only_roads and 'highway' not in w.tags:
            continue
        G.add_path(w.nds, id=w.id, data=w)
    for n_id in G.nodes_iter():
        n = osm.nodes[n_id]
        G.node[n_id] = dict(data=n)
    return G
        
    
class Node:
    def __init__(self, id, lon, lat):
        self.id = id
        self.lon = lon
        self.lat = lat
        self.tags = {}
        
class Way:
    def __init__(self, id, osm):
        self.osm = osm
        self.id = id
        self.nds = []
        self.tags = {}
        
    def split(self, dividers):
        # slice the node-array using this nifty recursive function
        def slice_array(ar, dividers):
            for i in range(1,len(ar)-1):
                if dividers[ar[i]]>1:
                    #print "slice at %s"%ar[i]
                    left = ar[:i+1]
                    right = ar[i:]
                    
                    rightsliced = slice_array(right, dividers)
                    
                    return [left]+rightsliced
            return [ar]
            
        slices = slice_array(self.nds, dividers)
        
        # create a way object for each node-array slice
        ret = []
        i=0
        for slice in slices:
            littleway = copy.copy( self )
            littleway.id += "-%d"%i
            littleway.nds = slice
            ret.append( littleway )
            i += 1
            
        return ret
        
        


#Encontrar los lugares
mapa = "medellin_colombia-grande.osm"
tree = ET.parse(mapa)
root = tree.getroot()
nodes = tree.findall('node')
ways = tree.findall('way')


poligonoEafit = encontrarNombre(ways,'Universidad EAFIT')
nodoIDEafit = list(poligonoEafit)[0].get('ref')
nodoEafit = encontrarNodo(nodes, nodoIDEafit, obtenerNombre(poligonoEafit) )
urbanizaciones = encontrarUrbanizaciones(ways) #280

#dibujar
n = 10
random.shuffle(urbanizaciones)
urbanizaciones = urbanizaciones[0:n]
puntos = [nodoEafit]+urbanizaciones
ys, xs = map( lambda x: float(x[0]), puntos), map(lambda x: float(x[1]), puntos)
plot_map(np.array(xs),np.array(ys), color = np.ones(len(xs)).reshape(-1, 1))

#caminos cortos
matriz = np.zeros((len(puntos),len(puntos)))
for i,puntoi in enumerate(puntos):
    for j,puntoj in enumerate(puntos):
        yi = float(puntoi[0])
        xi = float(puntoi[1])
        yj = float(puntoj[0])
        xj = float(puntoj[1])
        distanciaEnGrados = abs(xi - xj) + abs(yi - yj) #manhatan
        distanciaEnMetros = distanciaEnGrados * 111111
        duracionEnMinutos = distanciaEnMetros/333 #suponiendo 333 metros por minuto
        matriz[i][j] = duracionEnMinutos

#generar dataset
for p in [1.1,1.2,1.3]:
        archivo = codecs.open("dataset-ejemplo-U="+str(len(puntos))+"-p="+str(p)+".txt", "w", "utf-8")
        archivo.write("p "+str(p)+"\n\n")
        archivo.write("Vertices. Formato: ID, coordenada x, coordenada y, nombre\n\n")
        for i, punto in enumerate(puntos):
                archivo.write(str(i+1)+" "+str(punto[0])+" "+str(punto[1])+" "+punto[3]+"\n")
        archivo.write("\nCosto de Caminos Cortos. Formato: ID, ID, peso\n\n")
        for i in range(0,len(puntos)):
                for j in range(0,len(puntos)):
                        archivo.write(str(i+1)+" "+str(j+1)+" "+str(int(math.ceil(matriz[i][j])))+"\n")                  
        archivo.close()

