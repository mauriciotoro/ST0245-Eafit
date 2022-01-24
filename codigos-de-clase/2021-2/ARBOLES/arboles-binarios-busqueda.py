class Nodo:
  def __init__(self,val):
    self.val = val
    self.izq = None
    self.der = None

class BST:
  def __init__(self):
    self.raiz = None
  
  def buscar(self,k):
    return self.buscarAux(self.raiz, k)

  def buscarAux(self,n,k):
    if n == None:
      return False
    if n.dato == k:
      return True
    else:
      if k < n.dato:
        return buscarAux(n.izq,k)
      else:
        return buscarAux(n.der,k)









