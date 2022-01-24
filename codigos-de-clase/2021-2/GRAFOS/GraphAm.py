import numpy as np
from collections import deque

class GraphAm:
    def __init__(self, size):
      self.matriz = np.zeros( (size, size))
      self.size = size

    def getWeight(self, source, destination):
      return self.matriz[source][destination]

    def addArc(self, source, destination, weight):
      self.matriz[source][destination] = weight                

    def getSuccessors(self, vertex):
      lista = deque()
      for destination in range(self.size):
        if self.matriz[vertex][destination] != 0:
          lista.append(destination)
      return lista

    def __str__(self):
      return str(self.matriz)

def main():
  grafo = GraphAm(3)
  grafo.addArc(0,1) #  0 --> 1 --> 3
  grafo.addArc(0,2) #    |--> 2
  grafo.addArc(1,3) #
  print(grafo.getSuccessors(0))  

main()