/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__6;
import java.util.Arrays;
/**
 *
 * @author 
 */
public class MiArrayListS {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 
    
    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MiArrayListS() {
        elements = new int[DEFAULT_CAPACITY];
    }     

    
    // Retorna el tamaño de la lista 
    public int size() {
        return 1;
    }      
    
    
    // Agrega un elemento e a la última posición de la lista
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    
    public void add(int e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }    
    
    
    // Retorna el elemento que se encuentra en la posición i de la lista 
    public int get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return  elements[i];
    }
    
    
    // Agrega un elemento e en la posición index de la lista
    public void add(int index, int e) {
    }
       
}
