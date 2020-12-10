
// Java program to find given two array 
// are equal or not using hashing technique 
import java.util.*; 
import java.io.*; 
  
class GFG { 
    // Returns true if arr1[0..n-1] and arr2[0..m-1] 
    // contain same elements. 
    public static boolean areEqual(int arr1[], int arr2[]) 
    { 
        int n = arr1.length; 
        int m = arr2.length; 
  
        // If lengths of arrays are not equal 
        if (n != m) 
            return false; 
  
        // Store arr1[] elements and their counts in 
        // hash map 
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        int count = 0; 
        for (int i = 0; i < n; i++) { 
            if (map.get(arr1[i]) == null) 
                map.put(arr1[i], 1); 
            else { 
                count = map.get(arr1[i]); 
                count++; 
                map.put(arr1[i], count); 
            } 
        } 
  
        // Traverse arr2[] elements and check if all 
        // elements of arr2[] are present same number 
        // of times or not. 
        for (int i = 0; i < n; i++) { 
            // If there is an element in arr2[], but 
            // not in arr1[] 
            if (!map.containsKey(arr2[i])) 
                return false; 
  
            // If an element of arr2[] appears more 
            // times than it appears in arr1[] 
            if (map.get(arr2[i]) == 0) 
                return false; 
  
            count = map.get(arr2[i]); 
            --count; 
            map.put(arr2[i], count); 
        } 
  
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr1[] = { 3, 5, 2, 5, 2 }; 
        int arr2[] = { 2, 3, 5, 5, 2 }; 
  
        if (areEqual(arr1, arr2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

