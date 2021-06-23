class Node:
  def __init__(self,d):
    self.data = d
    self.left = None
    self.right = None

def solveAux(a, l, r):
  if l > r:
    return None
  
  m = int(l + (r - l) / 2)
  root = Node(a[m])
  root.left = solveAux(a, l, m - 1)#........................
  root.right = solveAux(a, m + 1, r)#.......................
  return root

def solve(a):
  return solveAux(a, 0, len(a) - 1)

def __main__():
  print(solve([1,2,3,4,5,6]).data)

__main__()
