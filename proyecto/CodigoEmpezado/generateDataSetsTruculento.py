# Generate positions of robotic bees in Bello, Antioquia
# ---Mauricio Toro

#sudo apt-get install python-matplotlib

import random
import matplotlib.pyplot as plt
from matplotlib.patches import Polygon
import matplotlib.lines as mlines
import numpy as np
import matplotlib
from matplotlib.collections import PatchCollection
from matplotlib import path 

#====Functions

#Is there a point x,y inside a polygon?
def isPointInside(x, y, polygon):
     p = path.Path(polygon)
     return p.contains_point( (x,y) )

#Create a Map of Bello
def plotMap(title):
     fig, ax = plt.subplots()
     patches = []
     for polygonPoints in polygons:
         polygon = Polygon(np.array(polygonPoints), True)
         patches.append(polygon)
     p = PatchCollection(patches, cmap=matplotlib.cm.jet, alpha=0.4) 
     ax.set_xlim([-75.6, -75.5])
     ax.set_ylim([6.3, 6.37])
     ax.add_collection(p)
     ax.set_title(title, fontsize=12, fontweight='bold')     
     return fig, ax

#Convert from meters to degrees
def meters2degrees(meters):
     return meters/111111.0

#Create a list of bee coordinates with a fixed number of total bees
#and a fixed number of bees close to colision 
def listOfBees():
   bees = [0]*4
   mx = (-75.6 - 75.5)/2
   my = (6.3 + 6.37)/2
   bees[0] = (mx+meters2degrees(50),my+meters2degrees(50))
   bees[1] = (mx-meters2degrees(50),my+meters2degrees(50))
   bees[2] = (mx+meters2degrees(50),my-meters2degrees(50))
   bees[3] = (mx-meters2degrees(50),my-meters2degrees(50))
   return bees 

#Plot the bees and generate a txt file with the coordinates
def plotMapAndTxt(bees):
     title = "ConjuntoDeDatosCon"+str(len(bees))+"abejas"
     theFile = open(title+".txt", 'w')
     fig, ax = plotMap(title)
     theFile.write("Coordenada x de la abeja, coordenada y de la abeja\n")
     mx = (-75.6 - 75.5)/2
     my = (6.3 + 6.37)/2    
     l = mlines.Line2D([mx,mx], [6.3,6.37])
     ax.add_line(l)
     l = mlines.Line2D([-75.6,-75.5], [my,my])
     ax.add_line(l)
     for x,y in bees:
          theFile.write(str(x)+","+str(y)+"\n")
          ax.scatter(x,y,alpha=0.4)
     theFile.close()    
     plt.savefig(title+".png")
     plt.close(fig)

#=====Load polygons of the districts
theFile = open("polygons.dat",'r')
polygons, flat, Xs, Ys, minX, minY, maxX, maxY = eval(theFile.read())
theFile.close()

#====Create maps with bees
bees = listOfBees()
plotMapAndTxt(bees)



