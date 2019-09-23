//package Taller__8;
import java.util.*;

/**
 * La clase Taller8 tiene la intención de
 * enfatizar en el uso de pilas y colas ya 
 * implementadas en java
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html"> Ver más acerca de colas<a/>
 * @se e <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html"> Ver más acerca de pilas <a/> 
 * @author Mauricio Toro, Andrés Páez, Daniel Mesa 
 */

 //Nota: Hacen falta algunas partes de las lineas de codigo, estas estan indicadas con una linea, ¡debes completarlas!
public class Taller8 {
    
    /**
    * @param string es una cadena de texto que viene de este modo 3 4 5 * + o de esta manera 2 3 * 5 +
    * todo viene separado por espacios por lo que la funcion split.("") vendría muy bien para separarlos
    * Se intenta hacer el calculo por medio del metodo polaco posfijo
    * @return un entero resultado de la operación
    */
    public static int polaca  (String string){
        String[] prefixStr = string.split(" "); 
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<prefixStr.length;i++){
            if(prefixStr[i].equals("+")){
                stack.push(stack.pop()+ _______ );
            }
            else if(prefixStr[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(prefixStr[i].equals("-")){
                stack.push( __________ -stack.pop());
            }
            else if(prefixStr[i].equals("/")){
                stack.push(stack.pop() ____ stack.pop());
            }
            else{
                stack._______(Integer.parseInt(prefixStr[i]));
            }
        }
        _______ stack.pop();
    }
	
    /**
    *

    *  posición de una pila si no que tambien devuelve su valor.
    * @return una pila que aga el inverso de sta ck
    */
    public static Stack<Integer> inversa (_________ stack){
        int n = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < n; i++) 
            temp._______(stack._______());
        return temp;
    }

    /* *
    * @param queue es una cola ya implementada que se crea en el test
    * Este método se encarga de atender a personas.
    * Nota: Se debe imprimir en consola a quién atiende y sacarlo de la cola
    * existe una función "pull" que hace el trabajo más fácil
    * 
    */
    public static void cola(Queue<String> queue){
        while (_________)    
            System.out.println("Atendiendo a " + queue._______());
    }
    

}
