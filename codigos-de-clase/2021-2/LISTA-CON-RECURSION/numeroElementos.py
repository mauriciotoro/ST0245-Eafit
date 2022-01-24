def numeroDeElementos(nodo : Node):
  if nodo == None:
    return 0
  else:
    return 1 + numeroDeElementos(nodo.next)
