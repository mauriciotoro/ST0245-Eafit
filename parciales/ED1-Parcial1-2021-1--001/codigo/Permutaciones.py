def solve(s):
  sol = [];
  tmp("", s, 0, len(s) - 1, sol)
  return sol

def tmp( l, s, i, j, sol):

  if i > j:
    sol.append(l)#..........................
    return

  c = "" + s[i]
  c = c.lower()
  tmp(l + c, s, i + 1, j, sol)
  k = "" + s[i]
  k = k.upper()
  if not c == k:
    tmp(l + k, s, i + 1, j, sol)#...........................

def __main__():
  print(solve("as22b"));
  print(solve("123"));
  print(solve("1B4"));

__main__()

