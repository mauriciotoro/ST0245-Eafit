package taller7;
/**
 * 
 * @author Kevin Arley Parra Henao - 201710093010, Daniel Alejandro Mesa Arango - 201710054010 
 * @version: 1.0  18/09/2017
 */
public class Laboratorio3 {
    //compara dos listas
    public static boolean  iguales(LinkedListLuisa lista1, LinkedListLuisa lista2)
    {
        if(lista1.size() != lista2.size())
        {
            return false;
        }else {
            for (int i = 0; i < lista1.size(); i++) {
               if (lista1.get(i) != lista2.get(i)) return false;
            }
            return true;
        }
    }
    //busca el elemento de mayor tamaño
    public static int maximo(LinkedListLuisa lista) {
        return maximoAux(lista.first);
    }
    
    private static int maximoAux(Node nodo) {
        if (nodo.next == null) 
        {
            return nodo.data;
        } else 
        {
            return Math.max(nodo.data, maximoAux(nodo.next));
        }

    }

    public static void main(String[] args) {

        LinkedListLuisa list = new LinkedListLuisa();
        LinkedListLuisa list2 = new LinkedListLuisa();
        
        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        
        list2.insert(5, 0);
        list2.insert(4, 0);
        list2.insert(3, 0);
        list2.insert(2, 0);
        list2.insert(1, 0);
        
        System.out.println(iguales(list, list2));
        
        System.out.println(maximo(list));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.contains(3));

        list.remove(4);

        System.out.println(list.contains(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
