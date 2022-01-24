class Node:
  def __init__(self, val):
    self.val = val
    self.izq = None
    self.der = None

class Arbol:
  def __init__(self):
    self.raiz = None

  def camino(self, k):
    lista = deque()
    caminoAux(self, self.raiz, k, lista)
    return lista

  def caminoAux(self, n, k, lista):
    if n == None:
      return False
    if n.dato == k:
      lista.appendleft(k)
      return True
    else:
      porlaIzquierdaEstaba = caminoAux(n.izq, k, lista)
      if not porlaIzquierdaEstaba:
        porlaDerechaEstaba = caminoAux(n.der, k, lista)
      if porlaIzquierdaEstaba or porlaDerechaEstaba:
        lista.appendleft(n.dato)


