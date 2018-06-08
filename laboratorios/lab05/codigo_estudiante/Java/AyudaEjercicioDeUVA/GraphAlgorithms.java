import java.util.*;
/**
 * This class contains algorithms for graphs
 * @author Mauricio Toro
 * @version 1
 */
public class GraphAlgorithms
{
     private static boolean bipartito(Graph g, int source)
     {
         //En esta algoritmos se dividiran los nodos en dos grupos
         //con el proposito de saber si es bipartito o no
         //Los grupos estaran definidos como 2 listas: 'A' y 'B'
         ArrayList<Integer> A = new ArrayList<Integer>();
         ArrayList<Integer> B = new ArrayList<Integer>();
         ArrayList<Integer> cola = new ArrayList<Integer>(); //Aqui se guardaran los nodos que aun NO se han visitado
         ArrayList<Integer> hijos = new ArrayList<Integer>(); //Aqui se guardaran los sucesores del nodo a visitar
         
         //Se pintan los nodos ya visitados
         int[] marcas = new int[g.size()];
         for (int i = 0; i < marcas.length; i++){
            marcas[i] = 0;  
        }
        
        //Se guarda el primer nodo
         char group = 'B';
         A.add(source);
         cola.add(source);
         marcas[source] = 1;
        
         while(!cola.isEmpty()){
             if(A.contains(cola.get(0))){ //Se ubica en el grupo del Nodo a Visitar
                 group = 'A';
             }
             else{ //Si no esta en A tiene que estar en B
                 group = 'B';
             }
             
             //Se guardan todos los hijos y se quita el nodo visitado
             hijos.addAll(g.getSuccessors(cola.get(0)));
             cola.remove(0);
             
             while(!hijos.isEmpty()){
                 if(group=='A'){
                     if(A.contains(hijos.get(0))){ //SI ENTRE LOS NODOS HIJOS EXISTE UNO YA PRESENTE EN EL MISMO GRUPO DEL PADRE, EL GRAFO NO ES BIPARTITO
                        return false;
                     }
                     if(!B.contains(hijos.get(0))){ //Se agregan los hijos a un grupo
                        B.add(hijos.get(0));
                     }
                     if(marcas[hijos.get(0)] == 0){ //Se marcan los nodo visitado
                         cola.add(hijos.get(0));
                         marcas[hijos.get(0)] = 1;
                     }
                     hijos.remove(0); //Se quitan los hijos para la proxima iteracion
                 }
                 else{
                     if(B.contains(hijos.get(0))){ //SI ENTRE LOS NODOS HIJOS EXISTE UNO YA PRESENTE EN EL MISMO GRUPO DEL PADRE, EL GRAFO NO ES BIPARTITO
                        return false;
                     }
                     if(!A.contains(hijos.get(0))){//Se agregan los hijos a un grupo
                        A.add(hijos.get(0));
                     }
                     if(marcas[hijos.get(0)] == 0){ //Se marcan los nodo visitado
                         cola.add(hijos.get(0));
                         marcas[hijos.get(0)] = 1;
                     }
                     hijos.remove(0); //Se quitan los hijos para la proxima iteracion
                 }
             }
         }
         return true; //Si al final no encontro ningun elemento con conexion a ningun otro elemnto del mismo grupo EL GRAFO ES BIPARTITO
     }
 public static void main(String[] args)
 {
     //Ejemplo de Grafo Bipartito
     GraphAL gal = new GraphAL(7);
     gal.addArc(0,3,0);
     gal.addArc(0,4,0);
     gal.addArc(0,5,0);
     gal.addArc(1,3,0);
     gal.addArc(1,4,0);
     gal.addArc(1,5,0);
     gal.addArc(2,3,0);
     gal.addArc(2,4,0);
     gal.addArc(2,5,0);
      
     System.out.println("--Primera Matriz--");
     System.out.println(bipartito(gal, 0));
     
     //Ejemplo de Grafo NO Bipartito
     GraphAM gam = new GraphAM(7);
     gam.addArc(0,3,0);
     gam.addArc(0,1,0);
     gam.addArc(0,2,0);
     gam.addArc(1,3,0);
     gam.addArc(1,2,0);
     gam.addArc(1,5,0);
     gam.addArc(2,3,0);
     gam.addArc(2,4,0);
     gam.addArc(2,5,0);
      
     System.out.println("--Segunda Matriz--");
     System.out.println(bipartito(gam, 0));
}
}
