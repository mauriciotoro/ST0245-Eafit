import java.util.ArrayList;
/**
 * Abstract class for implementations of Digraphs
 * 
 * @author Mauricio Toro
 * @version 1
 */
public abstract class Graph
{
   //Tamaño del grafo
   protected int size;
   /**
    * Constructor de Graph
    */
   public  Graph(int vertices) 
   {
       size = vertices;
   }
   /**
    * Metodo que agrega un arco entre dos vertices
    */
   public  abstract void addArc(int source, int destination, int weight);
   /**
    * Metodo que retorna el un ArrayList con el numero de todos los vertices que tengan una conexion
    * con uno
    */
   public abstract ArrayList<Integer> getSuccessors(int vertice);
   /**
    * Metodo que retorna el valor o peso de un arco entre dos vertices
    */
   public abstract int getWeight(int source, int destination);
   /**
    * Metodo que retorna el tamaño del grafo
    */
   public  int size() {return size;}
}
