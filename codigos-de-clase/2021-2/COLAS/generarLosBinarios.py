from collections import deque

def generarBinarios(N):
  cola = deque()
  cola.appendleft("1")
  lista = deque()
  return generarBinariosAux(N, cola,lista)

def generarBinariosAux(N, cola, lista):
  if N > 0:
    elemento = cola.pop()
    cola.appendleft(elemento+"0")
    cola.appendleft(elemento+"1")
    lista.append(elemento)
    generarBinariosAux(N-1, cola, lista)
  return lista

def main():
  print(generarBinarios(2))
  print(generarBinarios(7))
  print(generarBinarios(8))

main()

