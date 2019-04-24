import numpy as np

class GraphAm:

    def __init__(self, size):
        self.size = size
        self.matriz = np.zeros((size, size))
        
    def __str__(self):
        return f'{self.matriz}'

    def getWeight(self, source, destination):
        return self.matriz[source][destination]

    def addArc(self, source, destination, weight):
        self.matriz[source][destination] = weight

    def getSuccessors(self, vertex):
        succs = []
        for k, v in enumerate(self.matriz[vertex]):
            if v != 0:
                succs.append(k)
        return succs



ga = GraphAm(3)
ga.addArc(0, 1 , 15)
ga.addArc(0, 2 , 30)
ga.addArc(1, 1 , 7)
print(ga)
print(ga.getSuccessors(0))
print(ga.getWeight(1, 1))