import java.util.ArrayList;
/**
 * Esta clase es una implementación de un grafo usando listas de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class GraphAL extends Graph
{
   private ArrayList<ArrayList<Integer>> vertices;
   private ArrayList<ArrayList<Integer>> weights;
   
   public GraphAL(int size)
   {
       super(size);
       vertices = new ArrayList<ArrayList<Integer>>();
       weights = new ArrayList<ArrayList<Integer>>();
       for (int i = 0; i < size; i++)
       {
        ArrayList<Integer> arcs = new ArrayList<Integer>();
        ArrayList<Integer> ws = new ArrayList<Integer>();
        vertices.add(arcs);
        weights.add(ws);
       }
   }
   
   public void addArc(int source, int destination, int weight)
   {
     
       vertices.get(source).add(destination);
       weights.get(source).add(weight);
       
       vertices.get(destination).add(source);
       weights.get(destination).add(weight);
   }
   
   public int getWeight(int source, int destination)
   {
      for (int j = 0; j < size; j++)
      {
        if (vertices.get(source).get(j) == destination)
            return weights.get(source).get(j);
      }
      return -1;
   }
  
   public ArrayList<Integer> getSuccessors(int vertice)
   {
      return vertices.get(vertice);
   }
}
