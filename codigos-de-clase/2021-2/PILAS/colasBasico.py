from collections import deque
def main():
  cola = deque()
  cola.appendleft(1)
  cola.appendleft(2)
  cola.appendleft(3)
  print(cola)
  print(cola.pop())
  print(cola.pop())
  print(cola.pop())
  print(cola)
main()

