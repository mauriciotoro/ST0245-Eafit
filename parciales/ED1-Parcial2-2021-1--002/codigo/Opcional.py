from collections import deque
import numpy as np

#Retorna di: las distancias mas cortas del nodo v al nodo i
def bfs(g,  v):
    # Rellena un arreglo con "infinito" con el num vertices de g
    d = np.full(len(g), np.iinfo(np.int32).max)
    d[v] = 0
    q = deque()
    q.append(v)
    while(len(q) != 0):
      s = q.pop()
      for n in g[s]:        
        if d[s] + 1 < d[n]:
          d[n] = d[s] + 1
          q.append(n)
    return d




def diametro(g):
    v = u = w = 0
    d = bfs(g, v)
    n = d.size
    for i in range(0,n):
      if d[i] > d[u]:#............ :
          u = i
    f = bfs(g, u)
    for i in range (0,n):
      if f[i] > f[w]:#.......... :
          w = i
    return f[w]


def __main__():
    g = [[1],[2],[0]]
    print(diametro(g))

__main__()
