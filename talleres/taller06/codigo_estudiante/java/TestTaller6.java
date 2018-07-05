/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 
 */
public class TestTaller6 {
    
    public static void ejercicio2(){
        ArrayList<Integer> temp;
        temp = Taller6.opcinal2();
            System.out.print("Los números ingresados de forma inversa fueron fueron");
        for(int i=0;i<temp.size();i++){
            System.out.print(" "+temp.get(i));
        }
        System.out.println("");
    }
    
    public static boolean ejercicio3(){
        ArrayList<Integer> temp;
        int[] a,b,c,d,temp1,temp2,temp3,temp4;
        
        temp = Taller6.opcinal3(2);
        a = new int[] {1,1,2};
        temp1 = temp.stream().mapToInt(Integer::intValue).toArray();
        
        
        temp = Taller6.opcinal3(4);
        b = new int[] {1,1,2,1,2,3,1,2,3,4};
        temp2 = temp.stream().mapToInt(Integer::intValue).toArray();
        
        
        temp = Taller6.opcinal3(6);
        c = new int[] {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5,1,2,3,4,5,6};
        temp3 = temp.stream().mapToInt(Integer::intValue).toArray();
        
        
        temp = Taller6.opcinal3(11);
        d = new int[] {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,11};
        temp4 = temp.stream().mapToInt(Integer::intValue).toArray();
        
        
        if (!Arrays.equals(a,temp1) || !Arrays.equals(b,temp2) || !Arrays.equals(c,temp3) || !Arrays.equals(d,temp4))
            return false;
        return true;
    }
    
    public static void main(String[] args){
    	//Ejercicio2
        System.out.println("");
        System.out.println("Ejecutandose ejercicio Opcinal 2, recuerde escribir -1 para parar");
        ejercicio2();
        
        //Ejercicio3
        if(ejercicio3())
            System.out.println("Ejercicio 3 Correcto");
        else
        System.out.println("Ejercicio 3 Incorrecto");
    }
}
