# Python3 program to find if given 
# two arrays are equal or not  
# using dictionary 
from collections import defaultdict 
  
# Returns true if arr1[0..n-1] and  
# arr2[0..m-1] contain same elements. 
def areEqual(arr1, arr2, n, m): 
  
    # If lengths of array are not  
    # equal means array are not equal  
    if (n != m):  
        return False; 
          
    # Create a defaultdict count to  
    # store counts 
    count = defaultdict(int) 
  
    # Store the elements of arr1 
    # and their counts in the dictionary 
    for i in arr1: 
        count[i] += 1
      
    # Traverse through arr2 and compare 
    # the elements and its count with  
    # the elements of arr1 
    for i in arr2: 
  
        # Return false if the elemnent  
        # is not in arr2 or if any element 
        # appears more no. of times than in arr1 
        if (count[i] == 0): 
            return False
              
        # If element is found, decrement  
        # its value in the dictionary 
        else: 
            count[i] -= 1
              
    # Return true if both arr1 and  
    # arr2 are equal 
    return True
  
# Driver Code 
arr1 = [ 3, 5, 2, 5, 2 ] 
arr2 = [ 2, 3, 5, 5, 2 ] 
  
n = len(arr1)  
m = len(arr2)  
  
if areEqual(arr1, arr2, n, m):  
    print("Yes")  
else:  
    print("No")  
