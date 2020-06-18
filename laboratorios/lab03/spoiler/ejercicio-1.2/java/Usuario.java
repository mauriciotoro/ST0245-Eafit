
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

public class Usuario
{
    public static void main(String [] args){
        
        System.out.println("Hola usuario");  
        
        ejecucion();
    }

    public static void ejecucion(){

        Scanner sc = new Scanner(System.in);
        Consultas c = new Consultas();
             
        
        
        System.out.println("\n\n¿Qué consulta desea realizar");
        System.out.println("\n1. Consulta 1");
        System.out.println("2. Consulta 2");

        
        int a = sc.nextInt();
        
        switch(a){
            
         case 1:
         c.c1();
         break;
         
         case 2:
         c.c2();
         break;
            
        }
        
        System.out.println("\n\n¿Desea realizar otra consulta");
        System.out.println("\n1. Si");
        System.out.println("2. No");
        
        int b = sc.nextInt();
        
        switch(b){
            
         case 1:
         ejecucion();
         break;
         
         case 2:
         System.out.println("\n\nOk. Terminamos");
         break;
            
        }
    }

}
