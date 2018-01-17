package Taller__2;

// Una lista simplemente enlazada
public class LinkedListMauricio {

    public Node first;
    private int size;

    public LinkedListMauricio() {
        size = 0;
        first = null;
    }

    /**
     * Returns the node at the specified position in this list.
     *
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

// Retorna el tamaño actual de la lista
    public int size() {
        return size;
    }

// Inserta un dato en la posición index
    public void insert(int data, int index) {
        //Si el tamaño es 0...
        if (size == 0) {
            if (index > 0 || index < 0) {
                return;
            } else {
                //El primero sera el dato que nos den
                first = new Node(data);
                size++;
            }
            return;
        }
        //Si la posicion dada es 0.
        if (index == 0) {
            //Recolectamos la informacion de lo que teniamos
            Node act = first;
            Node sig = first.next;
            first = new Node(data);
            first.next = act;
            act.next = sig;
            //Se inserto el dato.
            size++;
            return;
        }
        //Si el indice esta fuera de limite, no hacemos nada
        if (index < 0 || index > size) {
            return;
        }
        //Recolectamos las informacion que tenemos
        Node act = first;
        Node sig = first;
        for (int i = 0; i < index; ++i) {
            //Miramos que hay antes y despues.
            act = sig;
            sig = sig.next;
        }
        //Creamos el nuevo nodo.
        Node n = new Node(data);
        act.next = n;
        n.next = sig;
        //Se inserto el dato
        size++;
    }

// Borra el dato en la posición index
    public void remove(int index) {
        Node act = first;
        Node sig = first;
        for (int i = 0; i < index; ++i) {
            act = sig;
            sig = sig.next;
        }
        //Si el dato esta en la posicion 0, lo borramos.
        if (act == sig) {
            first = first.next;
        } else {
            //Sino, hacemos un enlace con el siguiente del siguiente.
            act.next = sig.next;
        }
        //El dato esta eliminado.
        size--;
    }

// Verifica si está un dato en la lista
    public boolean contains(int data) {
        //Si no hay datos, pues ni modo "data" no esta.
        if(size == 0){
            return false;
        }
        //Miramos lo que tenemos
        Node temp = first;
        for (int i = 0; i < size; ++i) {
            //Miramos que hay en cada nodo y comparamos.
            if (temp.data == data) {
                return true;
            }
            //Analicemos el siguiente nodo.
            temp = temp.next;
        }
        return false;
    }
}
