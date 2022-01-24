class Nodo:
  def __init__(self,val):
    self.val = val
    self.izq = None
    self.der = None

class Arbol:
  def __init__(self):
    self.raiz = None

  def sacarCamino(self, k):
    return sacarCaminoAux(self, self.raiz, k)
    
  def sacarCaminoAux(self, n, k):
    if n == None:
      return deque()
    else:
      listaI = sacarCaminoAux(n.izq, k)
      listaI.appendleft(n.dato)
      listaD = sacarCaminoAux(n.der, k)
      listaD.appendleft(n.dato)
      if k in listaI:
        return listaI
      return listaD

def main():
  nodo2 = Node(2)
  nodo6 = Node(6)
  nodo8 = Node(8)
  nodo2.izq = nodo6
  nodo2.der = nodo8
main()
