# Generate positions of robotic bees in Bello, Antioquia
# ---Mauricio Toro

#sudo apt-get install python-matplotlib

import random
import matplotlib.pyplot as plt
from matplotlib.patches import Polygon
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
def listOfBees(totalNumberOfBees, numberOfBeenCloseToColision, polygons):
   bees = [0]*totalNumberOfBees

   i = 0
   while i < totalNumberOfBees - numberOfBeenCloseToColision:
       x, y = random.uniform(-75.6, -75.5), random.uniform(6.3, 6.37)
       if any(map(lambda polygon: isPointInside(x, y, polygon), polygons)):
            bees[i] = (x,y)
            i = i + 1

   while i < totalNumberOfBees:
       x, y = random.choice(bees[0:totalNumberOfBees - numberOfBeenCloseToColision])
       bees[i] = (x+meters2degrees(50),y-meters2degrees(50))
       i = i + 1

   return bees 

#Plot the bees and generate a txt file with the coordinates
def plotMapAndTxt(bees):
     title = "ConjuntoDeDatosCon"+str(len(bees))+"abejas"
     theFile = open(title+".txt", 'w')
     fig, ax = plotMap(title)
     theFile.write("Coordenada x de la abeja, coordenada y de la abeja\n")
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
for numberOfBees in [10,100,1000,10000,100000,1000000,10000000]:
     bees = listOfBees(numberOfBees, int(numberOfBees*0.2), polygons)
     plotMapAndTxt(bees)
     print numberOfBees


