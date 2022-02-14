import geopandas as gpd
import pandas as pd
import matplotlib.pyplot as plt
from shapely import wkt

#load data
nodes = pd.read_csv('puntos_del_mapa.csv',sep=';')
nodes['geometry'] = nodes['geometry'].apply(wkt.loads)
nodes = gpd.GeoDataFrame(nodes)

edges = pd.read_csv('calles_de_medellin.csv',sep=';')
edges['geometry'] = edges['geometry'].apply(wkt.loads)
edges = gpd.GeoDataFrame(edges)

area = pd.read_csv('poligono_de_medellin.csv',sep=';')
area['geometry'] = area['geometry'].apply(wkt.loads)
area = gpd.GeoDataFrame(area)

#Create plot
fig, ax = plt.subplots(figsize=(12,8))

# Plot the footprint
area.plot(ax=ax, facecolor='black')

# Plot street edges
edges.plot(ax=ax, linewidth=1, edgecolor='dimgray')

plt.tight_layout()


