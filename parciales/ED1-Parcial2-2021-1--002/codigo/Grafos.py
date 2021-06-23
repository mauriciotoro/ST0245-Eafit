import numpy as np
def colorear(grafo):
    n = len(grafo)
    color = np.zeros(n+1)
    for i in range(0,n):
      color[i] = -1
    color[0] = 0
    colordisponible = np.zeros(n + 1)
    for i in range(0,n):
      colordisponible[i] = 1
    for u in range (1,n):
      for i in range(0,n):
        if grafo[u][i] == 1:
          if color[i] != -1:
            colordisponible[int(color[i])] = 0
      color[u] = 0
      for aval in range(0,n):
       if colordisponible[aval] == 1:
         color[u] = aval
         break     
    for i in range(0,n):
      colordisponible[i] = 1
    usado = np.zeros(n+1)
    res = 0
    for i in range(0,n):
      if usado[int(color[i])] == 0:
        usado[int(color[i])] = 1 
        res = res +1
    return res+1

def __main__():
   g = [ [0, 1, 0], [0, 0, 1], [1, 0, 0]]
   print(colorear(g))

__main__()
