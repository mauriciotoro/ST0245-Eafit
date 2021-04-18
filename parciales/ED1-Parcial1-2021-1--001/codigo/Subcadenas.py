import numpy as np
def solve(s, k):
  if(len(s) < k): 
    return 0
  count = np.zeros(26)
  for i in range (0,k):
    count[ord(s[i]) - 97] += 1
  ans = 1 if check(count) else 0
  for i in range (k, len(s)): 
    count[ord(s[i - k]) - 97] -= 1
    count[ord(s[i]) - 97] = count[ord(s[i]) - 97] + 1
    if check(count):
      ans += 1
  return ans

def check(count):
  for i in range(0,26):
    if count[i] > 1:
     return False
  return True

def __main__():
  print(solve("andamasqueyo",5))
  print(solve("casa",5))

__main__()
