import java.util.LinkedList;
import java.util.Objects;

public class Node {

    private int dato;
    private int color = 0;
    private LinkedList<Node> successors;

    public Node(int dato) {
        this.dato = dato;
        successors = new LinkedList<>();
    }

    public int getColor() {
        return color;
    }

    public int setColor(int color) {
        int result = -1;
        if (this.color == 0) {
            this.color = color;
            result = 1;
        }else if (this.color == color) {
            result = 0;
        }
        return result;
    }

    public LinkedList<Node> getSuccessors() {
        return successors;
    }

    public void addSuccessor(Node node) {
        successors.add(node);
    }

    public int getDato() {
        return dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return dato == node.dato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dato, color, successors);
    }

    @Override
    public String toString() {
        return dato + "";
    }
}
