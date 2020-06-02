import numpy as np

class GraphAm:

    def __init__(self, size):
        self.size = size
        self.matriz = np.zeros((size, size))
        
    def __str__(self):
        return f'{self.matriz}'

    def getWeight(self, source, destination):
        return self._____[____][_____]

    def addArc(self, source, destination, weight):
        self.matriz[_____][____] = ____

    def getSuccessors(self, vertex):
        succs = []
        for k, v in enumerate(self.matriz[vertex]):
            if v != ___:
                succs.____(____)
        return succs



ga = GraphAm(3)
ga.addArc(0, 1 , 15)
ga.addArc(0, 2 , 30)
ga.addArc(1, 1 , 7)
print(ga)
print(ga.getSuccessors(0))
print(ga.getWeight(1, 1))