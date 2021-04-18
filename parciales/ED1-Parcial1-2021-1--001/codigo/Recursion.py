def solveAUX(a, i, j):
    if i == j: 
      return a[i]
    return max(a[i] - solveAUX(a, i + 1, j), a[j] - solveAUX(a, i, j - 1))
  
def solve(a):
    return solveAUX(a, 0, len(a) - 1)

def __main__():
    print(solve([10, 80, 90, 30]))
    print(solve([10, 20, 30, 50]))

__main__()
  
