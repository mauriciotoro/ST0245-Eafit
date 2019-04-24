import javafx.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;

//GRAFO CON LISTAS
public class DigraphAL extends Graph
{
    private ArrayList<LinkedList<Pair<Integer,Integer>>> nodo;

    public DigraphAL(int size) {
        super(size);
        nodo = new ArrayList<>();
        for (int i = 0; i < size + 1; i++) {
            nodo.add(new LinkedList<>());
        }
    }
    public void addArc(int source, int destination, int weight){
        nodo.get(source).add(new Pair<>(destination,weight));
    }
    public int getWeight(int source, int destination) {
        int result = 0;
        for (Pair<Integer, Integer> integerIntegerPair : nodo.get(source)) {
            if (integerIntegerPair.getKey() == destination) result = integerIntegerPair.getValue();
        }
        return result;
    }
    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> n = new ArrayList<>();

        nodo.get(vertice).forEach(i -> n.add(i.getKey()));

        return n;
    }
}
