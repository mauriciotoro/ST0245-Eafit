def doSomething(n):
  sum = 0
  for i in range(1, n+1):
    j = i+1
    while j <= n:
      sum = sum + 1;
      j = j * 2

doSomething(10)
