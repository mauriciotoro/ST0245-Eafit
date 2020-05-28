import time
import random
#Ejercicio 1
def ArraySum(arr):
    result=0;#C1
    for i in range(0,len(arr)):#C2*n
        result=arr[i]+result#C3*n
    print(result)#C4
"""
T(n)=C1+C2*n+C3*n+C4
T(n)=n*(C2+C3)+C'-->Regla de las sumas
T(n)=n*C'---->Se quitan los productos
T(n)=O(n)
"""
#Ejercicio 2
def tablas(n):
    for i in range(0,____): #C1*n
        for j in range(0,____):#C2*n*n
            ans=___ #C3*n*n
            print(str(i)+"*"+str(j)+"="+str(____)) #C4*n*n
"""
T(n)=C1*n+C2*n^2+C3*n^2+C4*n^2
T(n)=n^2*(C1+C3+C4)+C'-->Regla de las sumas y producto
T(n)=n^2*C'---->Se quitan los productos y se simplifica la suma
T(n)=O(n^2)
"""
#Ejercicio 3
def ordenar(arr):
    for i in range(0,len(arr)): #C1*n
        j=i;#n*C2
        while j > 0 &(arr[j-1]>arr[j]):#C3* n(n+1)/2
            temp=arr[j]#C4* n(n+1)/2
            arr[j]=____#C5* n(n+1)/2
            arr[j-1]=temp#C6* n(n+1)/2
            j=____#C7* n(n+1)/2
"""
T(n)=C1*n+n*C2+C3*n(n+1)/2+C4*n(n+1)/2+C5*n(n+1)/2+C6*n(n+1)/2+C7*n(n+1)/2
T(n)=(n(n+1)/2*)(C3+C4+C5+C6)+C'-->Regla de las sumas y producto
T(n)=(n^2+n)*1/2*C'---->Se quita la suma interna
T(n)=n^2+n---->Se quitan los productos y la suma interna
T(n)=O(n^2)
"""
#_______________________________________________________________________________
#Metodos para medir el tiempo
def getTime(meth,a,b):
     ini = ((time.time()))
     meth(a)
     fin = ((time.time()))
     print(str(fin-ini))

n=___
while n<=_____
 arr=_____
 for x in range(n):
    arr[x]=____
 getTime(ordenar,arr,n)
 n=n+____

