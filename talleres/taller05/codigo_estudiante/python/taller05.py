#!/usr/bin/python
import random
from matplotlib import pyplot as pl
import time

def array_generator(len):
    """List generator"""

def array_sum(array):
    """Add the elements in the array"""

def insertion_sort(array):

def multiplication_tables(n):


#------------------------------Graphics--------------------------------#

def graph(function, n, name, color, X = [],Y = [],Z = []):
    #Enter the function to test in attribute "function"
    #Enter the number of iterations do you want to try in "n"
    #Enter the color of the plot like this red: 'r', blue: 'b'

    for i in range(n):
        X.append(i)
        t = time.time()
        Z.append(function(i))
        Y.append(time.time()-t)

    print(Z) #this print all i's fibonacci i a  list
    pl.xlabel("N'simo" +  name)
    pl.ylabel('Tiempo de ejecucion')
    pl.title(name)
    pl.plot(X,Y,color, label = name) # domain of x(n) vs time
    pl.legend()
    pl.savefig(name + ".png")  # produce a .png file
    pl.show()

tiempo = []
iteraciones = []
res = []

for i in range(1,20000000,100000):
    array = array_generator(i)
    iteraciones.append(i)
    t = time.time()
    res.append(arraySum(array))
    tiempo.append(time.time() - t)

print res
pl.xlabel("n array")
pl.ylabel("Tiempo de ejecucion")
pl.title("ArraySum")
pl.plot(iteraciones, tiempo, 'r', label = "ArraySum")
pl.legend((''))
pl.savefig("ArraySum.png")
pl.show

