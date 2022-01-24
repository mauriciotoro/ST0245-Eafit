from collections import deque
import sys
sys.setrecursionlimit(1500)

def generar(N):
  cola = deque()
  cola.appendleft("1")
  respuesta = deque()
  generarAux(N, cola, respuesta)
  return respuesta

def generarAux(N, cola,respuesta):
  if N > 0:
    elemento = cola.pop()
    respuesta.append(elemento)
    cola.appendleft(elemento+"0")
    cola.appendleft(elemento+"1")
    generarAux(N-1, cola, respuesta)

def main():
  print(generar(2))
  print(generar(7))
  print(generar(1100))

main()
