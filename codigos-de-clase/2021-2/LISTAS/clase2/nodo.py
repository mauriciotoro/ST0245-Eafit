#librería de lista doblemente enlazada ya hecha se llama deque

class Nodo:
    def __init__(self,dato):
        self.__dato__ = dato
        self.__siguiente__ = None
    
class ListaSimplementeEnlazada:
    def __init__(self):
        self.__primero__ = None
        self.__tamanho__ = 0

    def insertarAlInicio(self,dato):
        nodoNuevo = Nodo(dato) #O(1)
        nodoNuevo.__siguiente__ = self.__primero__ #O(1)
        self.__primero__ = nodoNuevo #O(1)
                               # _____________ +
                               #      O(1)      

    def imprimir2(self):
        nodoTemp = self.__primero__ # O(1)
        while nodoTemp != None:      # O(n)
            print(nodoTemp.__dato__) # O(n)
            nodoTemp = nodoTemp.__siguiente__ #O(n+1) = O(n)
                                  # _____________ +
                                  #     O(n)
    def imprimir(self):
        self.__imprimir__(self.__primero__)

    def __imprimir__(self,nodo):
        if nodo != None:             # O(1)
            print(nodo.__dato__)     # O(1)
            self.__imprimir__(nodo.__siguiente__) #1 llamado de n - 1 -> O(n)

    def insertar(self,dato,i):
        if i == self.__tamanho__:
            raise Exception("Disculpa, no hay posicion "+str(i))

def __main3__():
    lista1 = ListaSimplementeEnlazada()
    for i in [30,20,10]:

        lista1.insertarAlInicio(i)

def __main2__():
    lista1 = ListaSimplementeEnlazada()
    lista1.insertarAlInicio(30)
    lista1.insertarAlInicio(20)
    lista1.insertarAlInicio(10)

def __main__():
    lista1 = ListaSimplementeEnlazada()
    nodo1 = Nodo(10)
    nodo2 = Nodo(20)
    nodo3 = Nodo(30)

    lista1.__primero__ = nodo1
    nodo1.__siguiente__ = nodo2
    nodo2.__siguiente__ = nodo3

__main__()