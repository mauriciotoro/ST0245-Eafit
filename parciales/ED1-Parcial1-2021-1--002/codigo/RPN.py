def solve(tokens):
  operators = "+-*/"
  aList = []
  for t in tokens:
    if not t in operators:
      aList = [t] + aList
    else:
      a = int(aList[0])
      aList = aList[1:]
      b = int(aList[0])
      aList = aList[1:]
      index = operators.index(t)
      if index == 0:
       aList = [str(a+b)] + aList 
      elif index == 1:
       aList = [str(a-b)] + aList 
      elif index == 2:
       aList = [str(a*b)] + aList 
      else:
       aList = [str(b/a)] + aList 
  last = aList[0]
  return int(last)

def __main__():
  print(solve(["3","10","5", "+", "*"]))

__main__()

