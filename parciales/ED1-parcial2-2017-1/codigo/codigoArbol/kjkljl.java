
/**
 * Write a description of class kjkljl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Queue;
import java.util.LinkedList;
public class kjkljl
{
    
public static boolean sumaElCamino(Nodo a, int suma)
{
    if (a == null)
       return false;
    if (a.izq == null && a.der == null)
         return suma == a.dato;
    else
         return sumaElCamino(a.izq, suma - a.dato) || sumaElCamino(a.der, suma - a.dato);
}

public static void main2()
{
    Nodo a5 = new Nodo(5);
    Nodo a4 = new Nodo(4);
    Nodo a8 = new Nodo(8);
    Nodo a11 = new Nodo(11);
    Nodo a13 = new Nodo(13);
    Nodo b4 = new Nodo(4);
    Nodo a7 = new Nodo(7);
    Nodo a2 = new Nodo(2);
    Nodo a1 = new Nodo(1);
    a5.izq = a4;
    a5.der = a8;
    a4.izq = a11;
    a11.izq = a7;
    a11.der = a2;
    a8.izq = a13;
    a8.der = b4;
    b4.der = a1;
    System.out.println(sumaElCamino(a5,27));
    System.out.println(sumaElCamino(a5,25));

}

    
public static String hotPotato(Queue<String> q, int num){
  while (q.size() > 1){
      for (int i = 1; i <= num; i++)
         q.add(q.remove());
      q.remove();
    }
  return q.remove();
}

public static void main()
{
    Queue<String> q = new LinkedList<String>();
    q.add("Bill");
    q.add("David");
    q.add("Susan");        
    q.add("Jane");        
    q.add("Kent");        
    q.add("Brad");        
    System.out.println(hotPotato(q,7));
    
}
  
}
