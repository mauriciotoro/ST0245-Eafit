/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__9;

import java.util.Hashtable;

/**
 *
 * @author 
 */
public class Taller9S {
    //pedrito 1
    public static void agregar(Hashtable empresas,String key, String value){
        empresas.put(key,value);
    }
    
    
    //pedrito 2
    public static void buscar(Hashtable empresas,String key){
        System.out.println(empresas.get(key));
    }
    
    
    //pedrito 3
    public static boolean contienekey(Hashtable empresas,String key){
        return empresas.containsKey(key);
    }    
}



