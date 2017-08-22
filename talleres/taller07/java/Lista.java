package Taller__7;

/**
 *
 * @author 
 */
public class Lista {
      Nodo inicio; 
       
       public class Nodo {    
           int data;     
           Nodo siguiente; 
           
           public Nodo(int data){    
               this.data = data;
           }
       }  
       
       public Lista(){ 
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
           //...
       } 
       
       
       public void agregar_al_inicio(int n) {
           //...
       }
       
       
       
       //Punto 2-a Imprimir los elementos de la lista en orden inverso
       public void imprimir_inverso() { 
           //...
       }
       
       
       //Punto 2-b Imprimir el valor que se encuentre en la posición n. 
       public void imprimir(int n) { 
           //...
       }  
       
       
       //Punto 2-c Eliminar el nodo del final   
       public void borrarFinal() { 
           //...
       }
       
       //Punto 2-d Eliminar el primer nodo de una lista 
       public void borrarInicio() { 
           //...
       }
       
       
       //Punto 3 Comparar el contenido de dos listas.
       public boolean comparar(Lista lista) {  
           //...
       }  
}
