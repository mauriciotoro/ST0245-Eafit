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
        root=new Node(preOrder[0]);
        for(int i = 1; i < preOrder.length; i++) {
            insert(root, preOrder[i]);
        }
    }

    public void insert (Node node, int data) {
        if(______ && node.left == null) {
            node.left = new Node(data);
        } else if(______) {
            insert(______, data);
        } else if(______ && node.right == null) {
            node.right = new Node(data);
        } else if(______) {
            insert(______,data);
        }
    }

    public void preOrder(Node node) {
        if(node != null) {
            System.out.println(node.data);
            preOrder(______);
            preOrder(______);
        }
    }

    public void posOrder(Node node) {
        if(node != null) {
            posOrder(______);
            posOrder(______);
            System.out.println(node.data);
        }
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