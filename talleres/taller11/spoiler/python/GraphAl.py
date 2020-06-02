class GraphAl:
    
    def __init__(self, size):
        self.size = size
        self.lista = [[] for i in range(size)]

    def __repr__(self):
        return '{}'.format(self.lista)

    def getWeight(self, source, destination):
        for d in self.lista[____]:
            if d[___] == ____:
                return d[___]

    def addArc(self, source, destination, weight):
        self.lista[____].append((_____, ____))

    def getSuccessors(self, vertice):
        succs = []
        for d in self.lista[____]:
            succs.append(____)
        return succs

    


ga = GraphAl(3)
ga.addArc(0, 3, 10)
print(ga)
print(ga.getWeight(0, 3))
ga.addArc(0, 4, 7)
print(ga)
print(ga.getSuccessors(0))