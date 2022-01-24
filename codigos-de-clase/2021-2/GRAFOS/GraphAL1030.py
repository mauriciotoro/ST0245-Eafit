from collections import deque
class GraphAL:
    def __init__(self, size):
        self.arregloDeListas = [0]*size
        for i in range(size):
            arregloDeListas[i] = deque()

    def addArc(self, source, destination, weight):
        laListaEnlazadaQueEstaAhi = self.arregloDeListas[source]
        parejaDeDosCosas = (destination, weight)
        laListaEnlazadaQueEstaAhi.append(parejaDeDosCosas)

    def getSuccessors(self, source):

    def getWeight(self, source, destination):
        laListaEnlazadaQueEstaAhi = self.arregloDeListas[source]
        #for i in range(len(laListaEnlazadaQueEstaAhi)):
        #    if laListaEnlazadaQueEstaAhi[i][0] == destination:
        #        return laListaEnlazadaQueEstaAhi[i][1]
        for theDestination, weight in laListaEnlazadaQueEstaAhi:
            if theDestination == destination:
                return weight
        return 0

    def __str__(self):

def main():
    grafo = GraphAL(3)
    grafo.addArc(0,1) # 0 -> 1 -> 3
    grafo.addArc(0,2) #   -> 2
    grafo.addArc(1,3) #
    print(grafo.getSuccessors(0))

main()