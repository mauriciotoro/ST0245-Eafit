import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.lang.Object;
import java.util.*;
public class LectorDatos
{
    public LectorDatos() {
    }
    
    public HashMap<Long, Node> readNodes() {
        HashMap<Long, Node> nodes = new HashMap<>();
        try{
            FileReader f  = new FileReader("Vertices.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineCount = 0;
            while((line = b.readLine()) != null) {
                if(lineCount != 0) {
                    String[] data = line.split(" ");
                    Long id = Long.parseLong(data[0]);
                    Node v = new Node(id);
                    nodes.put(v.id, v);  
                }
                lineCount++;
            }
            b.close();
            return nodes;
        }catch (IOException e) {
            System.out.println("Asegurece de tener el documento ''Vertices''");
        }
        return nodes;
    }
    
    public ArrayList<Triplet<Long, Long, Double>> readEdges() {
        ArrayList<Triplet<Long, Long, Double>> edges = new ArrayList<>();
        try{
            FileReader f  = new FileReader("Arcos.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineCount = 0;
            while((line = b.readLine()) != null) {
                if(lineCount != 0) {
                    String[] data = line.split(" ");
                    Long source= Long.parseLong(data[0]);
                    Long destination = Long.parseLong(data[1]);
                    Double distance = Double.parseDouble(data[2]);
                    Triplet<Long, Long, Double> a = new Triplet(source, destination, distance);
                    edges.add(a);
                }
                lineCount++;
            }
            b.close();
        }catch (IOException e) {
            System.out.println("Asegurece de tener el documento ''Arcos''");
        }
        return edges;
    }
}
