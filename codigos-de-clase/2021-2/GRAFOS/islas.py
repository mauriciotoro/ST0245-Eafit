from collections import deque
import numpy as np

def getSuccessors(mapa, i, j):
  lista = deque()
  filas, columnas = mapa.shape
  for deltai in [-1,0,1]:
    for deltaj in [-1,0,1]:
      ii, jj = i + deltai, j + deltaj
      if (ii,jj) != (i,j) and ii != -1 and jj != -1 and ii != filas and jj != columnas:
        lista.append( (ii,jj) )
  return lista

def pintarIslaAmplitud(mapa, i, j):
  cola = deque()
  cola.appendleft( (i,j) )
  while len(cola) != 0:
    ii, jj = cola.pop()
    mapa[ii][jj] = 2
    sucesores = getSuccessors(mapa, ii, jj)
    for sucI, sucJ in sucesores:
      if mapa[sucI][sucJ] != 2 and mapa[sucI][sucJ] != 0:
        cola.appendleft( (sucI,sucJ) )

def pintarIslaProfundidad(mapa, i, j):
  if mapa[i][j] == 1:
    mapa[i][j] = 2
    sucesores = getSuccessors(mapa, i, j)
    for sucI, sucJ in sucesores:
      pintarIslaProfundidad(mapa, sucI, sucJ)
  #else:
    #pass

def contarIslas(mapa):
  filas, columnas = mapa.shape
  islas = 0
  for i in range(filas):
    for j in range(columnas):
      if mapa[i][j] == 1:
        islas = islas + 1
        pintarIslaAmplitud(mapa,i,j)
  return islas


def main():
  mapa = np.array( [ [1, 0, 0, 1],
                     [1, 1, 1, 0],
                     [0, 0, 0, 0],
                     [1, 1, 0, 1] ] )
  print( contarIslas( mapa) )  

def pruebasDePintarIsla():
  mapa = np.array( [ [1, 0, 0, 1],
                     [1, 1, 1, 0],
                     [0, 0, 0, 0],
                     [1, 1, 0, 1] ] )
  print(mapa)
  pintarIslaAmplitud(mapa, 0,0 )
  print(mapa)

def pruebasDeGetSuccessors():
  mapa = np.zeros( (5,5) )
  print(getSuccessors(mapa,0,0))
  print(getSuccessors(mapa,2,2))
  print(getSuccessors(mapa,4,4))

main()
