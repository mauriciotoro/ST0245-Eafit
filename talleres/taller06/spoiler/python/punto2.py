import math

def invertir(array):
    n = len(array)
    for i in range(0, math.floor(n / 2)):
            temp = array[i]
            array[i] = ____
            array[n - ____] = ____
    return array

array = []
n = int(input("Ingrese un numero"))

while n != -1:
    array.append(n)
    n = int(input("Ingrese un numero"))

print(array)
print(invertir(array))
