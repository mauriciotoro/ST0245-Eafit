
/**
 * Laboratorio 4 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;
import java.util.*;

public class Laboratory4
{
  // Computes the sum of an array recursively
  public static int ArraySum(int[] A, int n)
  {          
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      return sum;
  }
  
  // Computes the maximum value of an array recursively
  public static int ArrayMax(int[] A, int n)
  {
      int max;
      if (n == 0)
        max = A[0];
      else
        max = Math.max(A[n],ArrayMax(A, n-1));
      return max;
  }
  
  // Computes Fibonnacci series recursively
  public static int Fibonnacci(int n)
  {
     int result;
     if (n == 0 || n == 1)
       result = n;
     else
       result = Fibonnacci(n-1) + Fibonnacci(n-2);
     return result;
  }
  
  public static void main(String[] args)
  {
      int[] A = {1,5,3,2,6};
      int[] B = {1,5,3,2};
      int[] C = {1,5,2,6};
      int [] D = {5};
      int[][] Arrays = {A,B,C,D};   
      for (int[] X : Arrays)
      {        
      System.out.println(Laboratory4.ArraySum(X, X.length - 1) + " " + Laboratory4.ArrayMax(X, X.length -1) + " " + Laboratory4.Fibonnacci(X.length) +  "\n" );      
      }
  }
  
}
