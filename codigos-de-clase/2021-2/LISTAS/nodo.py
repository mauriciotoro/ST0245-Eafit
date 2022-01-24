
class Nodo:
    def __init__(self,d):
        self.__dato__ = d 
        self.__siguiente__ = None

class Lista:
    def __init_(self):
        self.__primero__ = None

    def __buscar__(self,nodo,numero):
        if nodo == None:
            return False
        if nodo.__dato__ == numero:
            return True
        else: #1 llamado recursivo con n - 1 -> O(n)
            return self.__buscar__(nodo.__siguiente__,numero)
    
    def buscar(self,numero):
        return self.__buscar__(self.__primero__,numero)

    def buscar2(self,numero):
        temp = self.__primero__
        while temp != None: #O(n)
            if temp.__dato__ == numero:
                return True
            temp = temp.__siguiente__
        return False

def __main__():
    lista1 = Lista()
    nodo1 = Nodo(10)
    nodo2 = Nodo(20)
    nodo3 = Nodo(30)
    nodo1.__siguiente__ = nodo2
    nodo2.__siguiente__ = nodo3
    lista1.__primero__ = nodo1
    print(lista1.buscar2(40))
    print(lista1.buscar2(20))
__main__()