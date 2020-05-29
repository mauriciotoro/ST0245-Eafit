package taller7;
import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
import taller7.Node;

// Una lista simplemente enlazada
public class LinkedListLuisa {

    Node first;
    private int size;
    
    public LinkedListLuisa() {
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
    public void insert(int data, int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            Node nuevo = new Node(data);
            nuevo.next = _______;
            first = _______;
            size++;
        } else if(index != 0){
            Node temp = getNode(index - 1);
            Node nuevo = new Node(data);
            nuevo._______ = temp.next;
            temp.next = nuevo;
            _______++;
        }else 
        {
            throw new IndexOutOfBoundsException();
        }
    }
// Borra el dato en la posición index

    public void remove(int index) {
        try {
            if (index == 0) {
                Node temp = first;
                first = temp.next;
                _______--;
            } else if (index == size - 1) {
                Node temp = getNode(size - 2);
                temp.next = null;
                _______--;
            } else {
                Node temp = getNode(index - 1);
                temp._______ = temp.next.next;
                _______--;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }

    }

// Verifica si está un dato en la lista
    public boolean contains(int data) {
        try {
            for (int i = 0; i < size; i++) {
                if (get(i) == data) {
                    return _______;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }
        return false;
    }
}


