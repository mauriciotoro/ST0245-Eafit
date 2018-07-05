#!/usr/bin/python
import random
from matplotlib import pyplot as pl
import time

def array_generator(len):
    """List generator"""


def array_sum(array, sum = 0):
    """Add the elements in the list"""


def multiplication_tables(n):


def insertion_sort(list):


def arrayMax(arr):
    return arrayMax_aux(arr, 0, 0)

def arrayMax_aux(arr, i, max):


#-----------------------------GroupSum----------------------------------#

def groupSum_aux(list, start, target):

def groupSum(list, target):


#----------------------------Fibonacci---------------------------------#

def fib_r(n):                             #Fibonacci recursivo


#------------------------------Graphycs--------------------------------#

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

for i in range(20):
    array = array_generator(i)
    iteraciones.append(i)
    t = time.time()
    res.append(arrayMax(array))
    tiempo.append(time.time() - t)

print res
pl.xlabel("n array")
pl.ylabel("Tiempo de ejecucion")
pl.title("ArrayMax")
pl.plot(iteraciones, tiempo, 'r', label = "ArrayMax")
pl.legend((''))
pl.savefig("ArrayMax.png")
pl.show

graph(fib_i, 20, "fibonacci Iterativo", 'b')
