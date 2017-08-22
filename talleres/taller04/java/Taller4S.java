/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__4;

/**
 *
 * @author 
 */
public class Taller4S {
    //Sumar elementos de un arreglo
    public static int suma (int[]array){
      int sum=0;
      for(int i=0;i<array.length;i++){
          sum+=array[i];
      }
        return sum;
    }
    
    
    //Tablas de multiplicar
    public static void mul (int num){
      for(int i=1;i<=10;i++){
          System.out.println(num+" x "+i+" = "+(num*i));
      }
    }
    
    
    //Ordenamiento por inserción
    
    public static int[] insertionSort (int[] array){
        int j=0;
        int temp=0;
        for(int i=0;i<array.length;i++){
            j=i;
            temp=array[j];
            while(j > 0 && array[j-1] > temp){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }
    
}
