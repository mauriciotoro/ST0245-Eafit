def mainSolve( s,  t):
    return solve(s, t, len(s), len(t)) 
  
def solve(s, t, i, j):
    if i == 0 or j == 0: 
       return 0;
    if s[i - 1] == t[j - 1]:
      return 1 + mainSolve(s[0:i-1], t[0:j-1])
    else:
      return max(mainSolve(s, t[0:j-1]), mainSolve(s[0:i-1], t))

def __main__():
    print (mainSolve("aa", "xayaz"))

__main__()
