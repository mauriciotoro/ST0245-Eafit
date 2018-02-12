
/**
 * Laboratorio 1 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;
import java.util.*;

public class Laboratory1
{
  // Computes the sum of an array recursively
  public static int ArraySum(int[] A, int n)
  {          

  }
  
  // Computes the maximum value of an array recursively
  public static int ArrayMax(int[] A, int n)
  {

  }
  
  // Computes Fibonnacci series recursively
  public static int Fibonnacci(int n)
  {

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
