def floodFillUtil(screen, x, y, prevC, newC): 
 if x < 0 or x >= len(screen[0]) or y < 0 or y >= len(screen) or screen[x][y] != prevC: 
        return
 if screen[x][y] == newC:
    	return

 screen[x][y] = newC 

 floodFillUtil(screen, x+1, y+1, prevC, newC) 
 floodFillUtil(screen, x-1, y-1, prevC, newC) 
 floodFillUtil(screen, x-1, y+1, prevC, newC) 
 floodFillUtil(screen, x+1, y-1, prevC, newC) 
 floodFillUtil(screen, x + 1, y, prevC, newC) 
 floodFillUtil(screen, x - 1, y, prevC, newC) 
 floodFillUtil(screen, x, y + 1, prevC, newC) 
 floodFillUtil(screen, x, y - 1, prevC, newC) 
  
def floodFill(screen, x, y, newC): 
 prevC = screen[x][y] 
 floodFillUtil(screen, x, y, prevC, newC) 



def numberOfPaths(m, n): 
 count = [[0 for y in range(n)] for x in range(m)] 

 for i in range(m): 
  count[i][0] = 1 

 for j in range(n): 
  count[0][j] = 1 

 for i in range(1, m): 
  for j in range(1, n):              
   count[i][j] = count[i-1][j] + count[i][j-1] 
 return count[m-1][n-1]



class Node: 
    def __init__(self, data): 
        self.data = data 
        self.next = None
  
class LinkedList: 
    def __init__(self, h): 
        self.head = h
    def get(self, i):
        temp = self.head
        for i in range(0,i):
          temp = temp.next
        return temp.data

def aux(ar1, ar2,  n,  m, i, j):
 m1 = 0
 if i != n and j != m:
   if ar1.get(i) < ar2.get(j):
        m1 = ar2.get(j)
        j = j+1
   else:
        m1 = ar1.get(i)
        i = i+1
 elif i < n:
  m1 = ar1.get(i)
  i = i+1
 else:
  m1 = ar2.get(j)  
  j = j+1
 return m1, i, j;

def med(ar1,  ar2, n, m):    
 i, j, m1, m2 = 0, 0, -1, -1
 if (m + n) % 2 == 1:
  for count in range(0, int((n+m)/2+1)):
    m1,i,j = aux(ar1, ar2, n, m, i, j)
  return m1
 else:
  for count in range(0, int((n+m)/2)+1):
    m2 = m1  
    m1,i,j = aux(ar1, ar2, n, m, i, j)  
 return (m1 + m2)/2  


def convertir(vector): 
    res = 0
    for i in range(len(vector)): 
        res = res * 2 + (ord(vector[i]) - ord('0'))   
    return res 




def sortedMerge(A, B):
  if A == None:
   return B
  if B == None:
   return A           
  if A.data < B.data: 
    A.next = sortedMerge(A.next, B) 
    return A 
  else:  
    B.next = sortedMerge(A, B.next); 
    return B; 


def __main__():

 # punto 1
 screen = [[1, 1, 1, 1, 1, 1, 1, 1],
[1, 1, 1, 1, 1, 1, 0, 0], 
[1, 0, 0, 1, 1, 0, 1, 1], 
[1, 2, 2, 2, 2, 0, 1, 0], 
[1, 1, 1, 2, 2, 0, 1, 0], 
[1, 1, 1, 2, 2, 2, 2, 0], 
[1, 1, 1, 1, 1, 2, 1, 1], 
[1, 1, 1, 1, 1, 2, 2, 1],]

 floodFill(screen, 4, 4, 3)
 print (screen)

 # punto 2
 print(numberOfPaths(2,3))

 #punto 3 [15,10,5],[20,3,2]))
 n1 = Node(15)
 n1.next = Node(10)
 n1.next.next = Node(5)
 l1 = LinkedList(n1)

 n2 = Node(20)
 n2.next = Node(3)
 n2.next.next = Node(2)
 l2 = LinkedList(n2)

 print(med(l1,l2, 3, 3))

 #punto 4
 print(convertir(['1','0', '1', '1']))

 #punto5
 n1 = Node(5)
 n1.next = Node(10)
 n1.next.next = Node(15)
 l1 = LinkedList(n1)

 n2 = Node(2)
 n2.next = Node(3)
 n2.next.next = Node(20)
 l2 = LinkedList(n2)


 print("punto 5")
 n3 = sortedMerge(n1, n2)
 while (n3 != None):
   print (n3.data)
   n3 = n3.next

__main__()
