def euclides(a, l):
 if (l == 0):
  return a
 else:
  return euclides(l, a%l)


n = int(input())
for i in range(n):
  a, l = map(int, input().split())
  print("Case {​​​}​​​: {​​​}​​​ ".format(i+1, euclides(a, l)))