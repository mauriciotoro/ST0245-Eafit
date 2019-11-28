import java.util.ArrayList;
//CODIGO BASE DADO POR EL PROFESOR
public abstract class Graph
{
    private int size;

    public Graph(int vertices)
    {
        size = vertices;
    }
    public  abstract void addArc(int source, int destination, int weight);
    public abstract ArrayList getSuccessors(int vertice);
    public abstract int getWeight(int source, int destination);
    public  int size() {
        return size;
    }
}