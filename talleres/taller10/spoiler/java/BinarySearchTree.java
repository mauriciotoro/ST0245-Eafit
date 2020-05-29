 
 public class BinarySearchTree {

     private Node root;
  
    
        // Constructor sin parametros iniciar sin nodo
    public BinarySearchTree() {
        this.root = null;
    }
    //Contructor iniciando con nodo
    public BinarySearchTree(int n) {
        this.root = new Node(n);
    }

    //Llama al metodo auxiliar insertar
    public void insertar(int n) {
        insertarAux(root, n);
    }
    // Agrega un nodo al arbol
    private void insertarAux(Node node, int n) {
        if (node.data == ______){
            return;
        }else if (______ > node.data) {
            if (node.rigth == null) {
                node.rigth = new Node(n);
            }else {
                insertarAux(______, n);
            }
        }else {
            if (node.left == null) {
                node.left = new Node(n);
            }else {
                insertarAux(______, n);
            }
        }
    }
  
    // Llama al metodo auxiliar buscar
    public boolean buscar(int n) {
        return buscarAux(root, n);
    }
    
    //Busca en el arbol si existe un valor, devuelve true o false, dependiendo de si este o no
    private boolean buscarAux(Node node, int n) {
        if (node.data == n) {
            return true;
        }
        if (node == null) {
            return ______;
        }
        if (n > node.data) {
            return buscarAux(______, n);
        }
        return buscarAux(______, n);
    }

    //Llama al metodo auxiliar borrar
    public void borrar(int n) {
        borrarAux(root, n);
    }
    
    //Borra un nodo el arbol
     private Node borrarAux(Node node, int n) {
        if (node == null) {
            return null;
        }
        if (node.data == ______) {
            if (______ == null && ______ == null) {
                return null;
            }
            if (node.rigth == null) {
                return node.left;
            }
            if (node.left == null) {
                return node.rigth;
            }else {
                node.data = encontrarNodoReemplazo(node.left);
            }
        }
        if (n > node.data) {
            node.rigth = borrarAux(node.rigth, n);
            return node;
        }
        node.left = borrarAux(node.left, n);
        return node;
    }

    private int encontrarNodoReemplazo(Node n) {
        if (n.rigth == null) {
            int res = n.data;
            n = null;
            return res;
        }
        return encontrarNodoReemplazo(n.rigth);
    }
}