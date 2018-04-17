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

#Convert from meters to degrees
def meters2degrees(meters):
     return meters/111111.0

#Create a list of bee coordinates with a fixed number of total bees
#and a fixed number of bees close to colision 
def listOfBees(totalNumberOfBees, numberOfBeenCloseToColision):
   bees = [0]*totalNumberOfBees
   i = 0
   while i < totalNumberOfBees - numberOfBeenCloseToColision:
       x, y = random.uniform(-75.6, -75.5), random.uniform(6.3, 6.37)
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
     theFile.write("Coordenada x de la abeja, coordenada y de la abeja\n")
     for x,y in bees:
          theFile.write(str(x)+","+str(y)+"\n")
     theFile.close()    

#====Create maps with bees
for numberOfBees in [10000000]:
     bees = listOfBees(numberOfBees, int(numberOfBees*0.2))
     plotMapAndTxt(bees)
     print numberOfBees


