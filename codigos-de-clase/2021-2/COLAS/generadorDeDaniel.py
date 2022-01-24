from collections import deque
def getBinary(x):
    if x == 0:
        return 0
    pila = deque()
    while x > 0:
        residuo = x%2
        pila.append(str(residuo))
        x = x//2    
        binary = ""
    for i in range(len(cola)):
        binary += pila.pop()
    return binary

def getBinaryTilX(x):
    lista = deque() #lista doblemente enlazada
    for i in range(x) : 
        lista.append(getBinary(i)) # O(1 * n * n)
    return listaprint(getBinaryTilX(7)) 
