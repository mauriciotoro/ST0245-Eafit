def sat(M,i,j,d,k)
   if (M[i][j] == '*')
      return d
   elif (M[i][j] == '#')
      return k
   else:
      return 0

def c(M,i,j,d,k):
   n = len(M)
   m = len(M[0])
   if i>=n or j>=m:
       return 0
   elif i == n-1 and j == m-1:
       return sat(M,i,j,d,k)
   else:
       return sat(M,i,j,d,k) + max(c(M,i,j+1,d,k), c(M,i+1,j,d,k))
    
#Usuario
#matriz = [[*...#,...]]
print (c(matriz,0,0,1,3))
