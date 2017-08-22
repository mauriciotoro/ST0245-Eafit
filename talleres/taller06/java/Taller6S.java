/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Taller6S {
    //Opcional 2
    public static ArrayList<Integer> opcinal2 (){
        ArrayList<Integer> arry = new ArrayList<>();
        Scanner in = new Scanner(System.in);  
        int n = in.nextInt();      
        while (n != -1) {        
            arry.add(n);             
            n = in.nextInt();
        }        
        ArrayList<Integer> arreglo = new ArrayList<>();  
        for(int i = 0; i < arry.size(); i++) {   
            arreglo.add(arry.get(arry.size()-1-i));
        }
        return arreglo;
    }
    
    
    //Opcional 3
    public static ArrayList<Integer> opcinal3 (int n){
        ArrayList<Integer> patron = new ArrayList<>();   
        for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= i; j++){ 
                patron.add(j);
            }
        }
        return patron;
    }
}
