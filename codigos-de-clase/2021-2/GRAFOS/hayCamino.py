import numpy as np
from collections import deque

def getSuccessors(matrizDeA, vertice):
  filas, columnas = matrizDeA.shape
  vecinos = deque()
  for destino in range(columnas):
    if matrizDeA[vertice][destino] != 0:
      vecinos.append( destino )
  return vecinos

def hayCaminoAmplitud(matrizDeA, origen, destino):
  cola = deque()
  cola.appendleft(origen)
  filas, columnas = matrizDeA.shape
  visitados = [False]*filas
  while len(cola) != 0:
    visitado = cola.pop()
    if visitado == destino:
      return True
    visitados[visitado] = True
    vecinos = getSuccessors(matrizDeA, visitado)
    for suc in vecinos:
      if not visitados[suc]:
        cola.appendleft(suc)
  return False

def main():
  matrizDeA = np.array( [[0, 1, 1, 0, 0],     # 0 -> 1 -> 3
                         [0, 0, 0, 1, 0],     #   -> 2 -> 4
                         [0, 0, 0, 0, 1],
                         [0, 0, 0, 0, 0],
                         [0, 0, 0, 0, 0] ] )
  
  print(hayCaminoAmplitud(matrizDeA, 0, 4))
  print(hayCaminoAmplitud(matrizDeA, 1, 4))


main()
