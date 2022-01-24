class Nodo:
    def __init__(self,dato):
        self.__dato__ = dato
        self.__siguiente__ = None

class Lista:
    def __init__(self):
        self.__primero__ = None
    def buscar(self, elemento):
        return self.__buscar__(self.__primero__,elemento)
    def __buscar__(self,nodo,elemento):
        if nodo == None:
            return False
        if nodo.__dato__ == elemento:
            return True
        else: #1 llamado de n - 1 -> O(n)
            return self.__buscar__(nodo.__siguiente__,elemento)
    def buscar2(self, elemento):
        nodo = self.__primero__
        while (nodo != None): #O(n)
            if nodo.__dato__ == elemento:
                return True
            nodo = nodo.__siguiente__
        return False 
    def insertarAlPrincipio(self, elemento):
        nodo = Nodo(elemento) #O(1)
        nodo.__siguiente__ = self.__primero__
        self__primero__ = nodo

def __main__():
    tomasLinkedList = Lista()
    nodo1 = Nodo(1)
    nodo2 = Nodo(2)
    nodo3 = Nodo(3)
    nodo1.__siguiente__ = nodo2
    nodo2.__siguiente__ = nodo3
    tomasLinkedList.__primero__ = nodo1
    print(tomasLinkedList.buscar(3))
    print(tomasLinkedList.buscar2(5))

__main__()