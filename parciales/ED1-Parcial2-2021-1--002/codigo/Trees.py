class Node:
  def __init__(self, val):
   self.val = val
   self.left = None
   self.right = None 

promMax = 0.0
theSum = 0
theSize = 1

def solve(root):
  solveTemp(root) 
  return promMax
 
def solveTemp(root):
  global promMax
  if root == None: 
     return (0, 0) #theSum, theSize
  l = solveTemp(root.left)
  r = solveTemp(root.right)
  sum = l[theSum] + r[theSum] + root.val#......................
  sz = 1 + l[theSize] + r[theSize]
  promMax = max(promMax, sum * 1.0 / sz) #.......................)
  return (sum, sz) #theSum, theSize

def __main__():
  G = Node(1)
  I = Node(7)
  H = Node(4)
  J = Node(5)
  D = Node(3)
  E = Node(2)
  F = Node(6)
  B = Node(8)
  C = Node(9)
  A = Node(1)
  G.left = D
  G.right = I
  D.left = B
  D.right = E
  E.right = F
  B.left = A
  B.right = C
  I.left = H
  I.right = J
  print(solve(G))

__main__()

