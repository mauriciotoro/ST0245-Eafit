class Node:
  def __init__(self,val):
    self.val = val
    self.izq = None
    self.der = None

class Arbol:
  def __init__(self):
    self.raiz = None

  def buscar(self, k):
    return self.buscarAux(self,self.raiz,k)

  def buscarAux(self, nodo, k):
    if nodo == None:
      return False
    if nodo.val == k:
      return True
    else:
      estaI = buscarAux(nodo.izq,k)
      estaD = buscarAux(nodo.der,k)
      return estaI or estaD     

def main():
  nodo1 = Node(1)
  nodo2 = Node(2)
  nodo3 = Node(3)
  nodo4 = Node(4)
  nodo1.izq = nodo2
  nodo1.der = nodo3
  nodo3.der = nodo4
#         1
#       2   3
#            4
main()

