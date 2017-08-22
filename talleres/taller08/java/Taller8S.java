/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__8;
import java.util.*;

/**
 *
 * @author 
 */
public class Taller8S {
    
    //Punto 1
    public static Stack<Integer> inversa(Stack<Integer> stack){
        int n = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < n; i++) 
            temp.push(stack.pop());
        return temp;
    }
    
    //Punto 2
    public static void Cola(Queue<Integer> queue){
    while (!queue.isEmpty())    
            System.out.println("Atendiendo a " + queue.poll());
    }
    
    
    //notacion polaca
    public static int polaca(String string){
        String[] prefixStr = string.split(" "); 
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<prefixStr.length;i++){
            if(prefixStr[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(prefixStr[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(prefixStr[i].equals("-")){
                stack.push(stack.pop()-stack.pop());
            }
            else if(prefixStr[i].equals("/")){
                stack.push(stack.pop()/stack.pop());
            }
            else{
                stack.push(Integer.parseInt(prefixStr[i]));
            }
        }
        return stack.pop();
    }
}
