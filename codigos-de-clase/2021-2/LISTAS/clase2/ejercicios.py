class Lista:
    class Nodo:
        def __init__(self,dato):
            self.__dato__ = dato
            self.__siguiente__ = None 
    
    def __init__(self):
        self.__primero__ = None
    
    def borrarEnLaMitad(self):
        n = self.tamanhoLista(self.__primero__)
        i = n // 2
        nodoAntesDeLaMitad = self.obtenerNodo(self.__primero__,i-1)
        nodoAntesDeLaMitad.__siguiente__ = nodoAntesDeLaMitad.__siguiente__.__siguiente__

    def obtenerElQueEstaEnI(self,i):
        n = self.tamanhoLista(self.__primero__)
        if i < 0 or i >= n:
            raise Exception("Perdon, pero no hay i = "+str(i))
        nodo = self.obtenerNodo(self.__primero__, i)
        return nodo.__dato__

    def insertarEnLaMitad(self,dato):
        n = self.tamanhoLista(self.__primero__)
        i = n // 2
        nodoAntesDeLaMitad = self.obtenerNodo(self.__primero__,i-1)
        nodoNuevo = self.Nodo(dato)
        nodoNuevo.__siguiente__ = nodoAntesDeLaMitad.__siguiente__
        nodoAntesDeLaMitad.__siguiente__ == nodoNuevo

    def obtenerNodo(self,cabeza,i): # 1 llamado n - 1 -> O(n)
        if i == 0:
            return cabeza
        else:
            return self.obtenerNodo(cabeza.__siguiente__,i-1)

    def obtenerNodoEnUnaLinea(self,cabeza,i): # 1 llamado de n - 1 -> O(n)
        return cabeza if i == 0 else self.obtenerNodoEnUnaLinea(cabeza.__siguiente__,i-1)
    
    def tamanho(self, cabeza):
        pass

    def invertir(self):
        nodoTemp = self.__primero__
        while nodoTemp != None:
            nodoTemp.__siguiente__ = nodoTemp.__anterior__ # No hay anterior
