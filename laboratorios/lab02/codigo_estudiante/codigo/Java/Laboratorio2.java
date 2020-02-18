
/**
 * Laboratorio 2 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;

public class Laboratorio2
{

  
  // Sorts an array using Insertion Sort
  public static void InsertionSort(int[] A)
  {
    
  }

      // Sorts an array using Merge Sort
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

        // Sorts an array using Merge Sort
	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{

	}

    // Merges two sorted arrays
    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
       
    }
  
  public static void main(String[] args)
  {
      int[] A = {1,5,3,2,6};
      int[] B = {1,5,3,2};
      int[] C = {1,5,2,6};
      int[][] Arrays = {A,B,C};  
      for (int[] X : Arrays)
      {        
        Laboratory1.mergeSort(X);
        Laboratory1.InsertionSort(X);     
      }
  }
  
}
