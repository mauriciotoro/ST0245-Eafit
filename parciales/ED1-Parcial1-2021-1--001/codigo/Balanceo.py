from collections import deque
def solve(exp):
  s = deque()
  for i in range(0, len(exp)):
    ei = exp[i]
    if ei == "(" or ei == "{" or ei == "[":
      s.append(ei)
    if ei == ")" or ei == "}" or ei == "]":
      if len(s) == 0 or not valid(s[len(s)-1], ei):
        return False
      else:
        s.pop()
  return len(s) == 0

def valid(o, c):
  return (o == "(" and c == ")") or \
         (o == "[" and c == "]") or \
         (o == "{" and c == "}")

def __main__():
  print(solve("(3 + [a + b])"))
  print(solve("[(6 + {b + c} - 100])"))

__main__()

