package Taller__8;

import java.util.*;

public class TestTaller8 {
	
    public static boolean ejercicio1(){
        Stack<Integer> a,b,c,d;
        int [] a1,b1,c1,d1,temp1,temp2,temp3,temp4;
        
        a = toStack(new int[] {1,2,3,4,5,5});
        a1 = new int[] {5,5,4,3,2,1};
        a = Taller8.inversa(a);
        temp1 = a.stream().mapToInt(Integer::intValue).toArray();
        
        b = toStack(new int[] {2,34,3,5,4,6,4,56,5});
        b1 = new int[] {5,56,4,6,4,5,3,34,2};
        b = Taller8.inversa(b);
        temp2 = b.stream().mapToInt(Integer::intValue).toArray();
        
        c = toStack(new int[] {33,4,54,2,34,436,5,4,43,2,342,234});
        c1 = new int[] {234,342,2,43,4,5,436,34,2,54,4,33};
        c = Taller8.inversa(c);
        temp3 = c.stream().mapToInt(Integer::intValue).toArray();
        
        d = toStack(new int[] {6,5,6,4,3,643,63,23,5,57,56,3,3,5,4});
        d1 = new int[] {4,5,3,3,56,57,5,23,63,643,3,4,6,5,6};
        d = Taller8.inversa(d);
        temp4 = d.stream().mapToInt(Integer::intValue).toArray();
        
        if(Arrays.equals(temp1,a1) && Arrays.equals(temp2,b1) && Arrays.equals(temp3,c1) && Arrays.equals(temp4,d1))
            return true;
        return false;
    }
    
    
    public static Stack<Integer> toStack(int[]array){
        Stack<Integer> a=new Stack<Integer>();
        for(int i=0;i<array.length;i++){
            a.push(array[i]);
        }
        return a;
    }
    
    
    public static void ejercicio2(){
    	Queue<String> cola1;
    	String[] a = {"Juan","Maria","Pedro","Mariana"};
    	cola1=toQueue(a);
    	Taller8.cola(cola1);
    }
    
    public static Queue<String> toQueue(String[]array){
        Queue<String> a=new LinkedList<String>();
        for(int i=0;i<array.length;i++){
            a.add(array[i]);
        }
        return a;
    }
    
    
    public static boolean ejercicio3(){
    	int a,b,c,d,a1,b1,c1,d1;
        String s1,s2,s3,s4;
        
        a=-14;
        s1 = "3 5 * 12 + 13 -";
        a1 = Taller8.polaca(s1);
        
        b=172;
        s2 = "12 5 * 232 -";
        b1 = Taller8.polaca(s2);
        
        c=884;
        s3 = "34 2 * 13 *";
        c1 = Taller8.polaca(s3);
        
        d=12;
        s4 = "67 3 * 21 - 7 * 12";
        d1 = Taller8.polaca(s4);
        
        if(a==a1 && c==c1 && b==b1 && d==d1)
            return true;
        return false;
    }
    
    public static void main(String[] args){
    	
        //Ejercicio1
        if(ejercicio1())
            System.out.println("Ejercicio 1 Correcto");
        else
        System.out.println("Ejercicio 1 Incorrecto");
        
        //Ejercicio2
        ejercicio2();
        
        //Ejercicio3
        if(ejercicio3())
            System.out.println("Ejercicio 3 Correcto");
        else
        System.out.println("Ejercicio 3 Incorrecto");
        
    }
}
