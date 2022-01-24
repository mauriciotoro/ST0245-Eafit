from collections import deque
def main():
  pila = deque()
  pila.append(1)
  pila.append(2)
  pila.append(3)
  print(pila)
  print(pila.pop())
  print(pila.pop())
  print(pila.pop())
  print(pila)
main()

