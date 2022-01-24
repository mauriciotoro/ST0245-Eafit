from collections import deque
import numpy as np

def sacarLosVecinos(mapa, i, j):
  vecinos = deque()
  filas, columnas = mapa.shape
  for deltaI in [-1,0,1]:
    for deltaJ in [-1,0,1]:
      nuevaI, nuevaJ = i + deltaI, j + deltaJ
      if (nuevaI, nuevaJ) != (i,j) and nuevaI != -1 and nuevaJ != -1 and nuevaI != filas and nuevaJ != columnas :
        vecinos.append( (nuevaI, nuevaJ) )
  return vecinos

def pintarUnaIslaProfundidad(mapa, i, j):
  if mapa[i][j] == 1:
    mapa[i][j], vecinos = 2, sacarLosVecinos(mapa, i, j)
    for (IdelVecino, JdelVecino) in vecinos:
      pintarUnaIslaProfundidad(mapa, IdelVecino, JdelVecino) 
  #else:
    #pass

def pintarUnaIslaAmplitud(mapa, i, j):
  cola = deque()
  cola.appendleft( (i, j) )
  while len(cola) != 0:
   Ivisitado, Jvisitado = cola.pop()
   if mapa[Ivisitado][Jvisitado] == 1:
    mapa[Ivisitado][Jvisitado], vecinos = 2, sacarLosVecinos(mapa, Ivisitado, Jvisitado)
    for pareja in vecinos:
      cola.appendleft( pareja )

def contarLasIslas(mapa):
  filas, columnas = mapa.shape
  islas = 0
  for i in range(filas):
    for j in range(columnas):
      if mapa[i][j] == 1:
        islas = islas + 1
        pintarUnaIslaAmplitud(mapa, i, j)
  return islas

def main():
  mapa = np.array( [[1, 1, 0, 0, 1],
                    [0, 0, 0, 1, 0],
                    [1, 0, 0, 0, 0],
                    [0, 0, 1, 1, 1]] )
  print(contarLasIslas(mapa))

def pruebasPintarUnaIslaAmplitud():
  mapa = np.array( [[1, 1, 0, 0, 1],
                    [0, 0, 1, 1, 0],
                    [0, 0, 0, 0, 0],
                    [1, 1, 0, 0, 1]] )
  print(mapa)
  pintarUnaIslaAmplitud(mapa, 0, 0)
  print(mapa)

def pruebasPintarIslaProfundidad():
  mapa = np.array( [[1, 1, 0, 0, 1],
                    [0, 0, 1, 1, 0],
                    [0, 0, 0, 0, 0],
                    [1, 1, 0, 0, 1]] )
  print(mapa)
  pintarUnaIslaProfundidad(mapa, 0, 0)
  print(mapa)

def pruebasDeSacarLosVecinos():
  mapa = np.zeros( (3,3) )
  print(sacarLosVecinos(mapa, 0, 0))
  print(sacarLosVecinos(mapa, 1, 1))
  print(sacarLosVecinos(mapa, 2, 2))

main()
