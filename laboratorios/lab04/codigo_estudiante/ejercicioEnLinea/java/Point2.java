import java.util.ArrayList;
public class Point2
{
    public class Node {
        public Node left;
        public Node right;
        public int data;
        public Node (int data) {
            this.data=data;
        }
    }

    public Node root;

    public void buildingTree (int [] preOrder) {
        ...
    }

    public void insert (Node node, int data) {
        ...
    }

    public void preOrder(Node node) {
        ...
    }

    public void posOrder(Node node) {
       ...
    }

    public void exercise21 (int [] input) {
        buildingTree(input);
        System.out.println("PosOrder");
        posOrder(root);
        System.out.println();
    }

    public static void main (String [] args) {
        int [] test = {50,30,24,5,28,45,98,52,60};
        Point2 testing = new Point2();
        testing.exercise21(test);
    }
}