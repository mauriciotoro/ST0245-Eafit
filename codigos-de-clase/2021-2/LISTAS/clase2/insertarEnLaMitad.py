class Nodo:
    def __init__(self,dato):
        self.__dato__ = dato
        self.__siguiente__ = None

def insertarEnLaMitad(head, dato):
    n = tamanhoDeLaLista(head)
    i = n//2
    nodoMitad = obtenerElNodoEn(head, i-1)
    nuevoNodo = Nodo(dato)
    nuevoNodo.__siguiente__ = nodoMitad.__siguiente__
    nodoMitad.__siguiente__ = nuevoNodo

def borrarEnLaMitad(head):
    n = tamanhoDeLaLista(head)
    i = n//2
    nodoMitad = obtenerElNodoEn(head,i-1)
    nodoMitad.__siguiente__ = nodoMitad.__siguiente__.__siguiente__

def obtenerElElemento(head, i):
    n = tamanhoDeLaLista(head)
    if i < 0 or i >= n:
        raise Exception("ojo, no hay esa i = "+str(i))
    return obtenerElNodoEn(head,i).__dato__

def obtenerElNodoEn(head,i):
    if i == 0: # caso parada O(1)
        return head
    else: # 1 llamado recursivo con n - 1 -> O(n)
        return obtenerElNodoEn(head.__siguiente__,i-1)
    
def obtenerElNodoEn2(head, i):
    return head if i == 0 else obtenerElNodoEn2(head.__siguiente)