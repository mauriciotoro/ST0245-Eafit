import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main() {
        LectorDatos d = new LectorDatos();
        HashMap<Long, Node> nodes = d.readNodes();
        System.out.println(nodes.size());
        ArrayList<Triplet<Long, Long, Double>> edges = d.readEdges();
        System.out.println(edges.size());
        EstructuraDatos e = new EstructuraDatos(nodes, edges);
        System.out.println(e.adjGraph.size());
        System.out.println(nodes.get(new Long(287291920)).id);
        
        Long l = new Long(287291920);
        Long l2 = new Long(1397149003);
        
        ArrayList<Long> test1 = e.getSuccessors(l);
        System.out.println(test1.size());
        
        for(Long i : test1) {
            System.out.println(i);
        }
        System.out.println("Distance: " + e.getWeight(l, l2));
    }
}
