/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__7;

/**
 *
 * @author 
 */
public class ListaS {
       Nodo inicio; 
       
       public class Nodo {    
           int data;     
           Nodo siguiente; 
           
           public Nodo(int data){    
               this.data = data;
           }
       }  
       
       
       public ListaS(){ 
           inicio= null;
       } 
       
       
       public void agregar(int n) {  
           Nodo nuevo = new Nodo(n);
           if (inicio != null) {
               nuevo.siguiente = inicio; 
               inicio= nuevo;      
           } 
           else { 
               inicio = nuevo;
           }
       }
       
       
       public void imprimir() {
           Nodo nodo = inicio;     
           while(nodo != null) {  
               System.out.println(nodo.data);  
               nodo = nodo.siguiente;
           }
       } 
       
       
       public void agregar_al_inicio(int n) {
           Nodo nodo = new Nodo(n);  
           nodo.siguiente = inicio;    
           inicio = nodo;
       }
       
       
       //Punto 2-a  
       public void imprimir_inverso() { 
           Nodo nodo = inicio;     
           int i = 0;    
           while(nodo != null) { 
               nodo = nodo.siguiente;  
               i++;
           }       
           for (int j = i-1; j >= 0; j--) {  
               imprimir(j);
           } 
       }
       
       
       //Punto 2-b     
       public void imprimir(int n) { 
           Nodo nodo = inicio;     
           for(int i = 0; i < n && nodo != null; i++) { 
               nodo = nodo.siguiente;
           }     
           System.out.println(nodo.data);
       }  
       
       
       //Punto 2-c    
       public void borrar() { 
           
       }
       
       
       //Punto 3   
       public boolean comparar(ListaS lista) {  
           Nodo nodo1 = inicio;       
           Nodo nodo2 = lista.inicio; 
           while (nodo1 != null) {  
               if(nodo2 == null || nodo1.data != nodo2.data)
                   return false; 
               nodo1 = nodo1.siguiente;
               nodo2 = nodo2.siguiente;
           }        
           if(nodo2 != null)
               return false;
           return true;
       }
       
}
