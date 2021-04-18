import numpy as np
def solve1( Q, aq,  k):
    result = np.zeros(Q)
    for i in range(0, Q):
      aq[i].sort() # Este usa Merge Sort
      result[i] = aq[i][k[i]]
    return result

def solve2(Q,  aq,  k):
    result = np.zeros(Q)
    for i in range(0, Q):
      insertionSort(aq[i]) # Este es Insertion Sort
      result[i] = aq[i][k[i]]
    return result

def insertionSort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >= 0 and key < arr[j]:
                arr[j + 1] = arr[j]
                j -= 1
        arr[j + 1] = key

def __main__():
   print(solve1(1,[[4,3,4654,3,2,30,0]],[3])[0])
   print(solve2(1,[[4,3,4654,3,2,30,0]],[3])[0])

__main__()
