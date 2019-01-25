import java.util.ArrayList;

/**
 * Clase abstracta para la implementacion de grafos dirigidos
 * recordar los usos de clase abstracta 
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html"> Abstract </a>
 *
 * @author Mauricio Toro, Camilo Paez
 */
public abstract class Digraph {
	protected int size;

	/**
	* Constructor para el grafo dirigido
	* @param vertices el numero de vertices que tendra el grafo dirigido
	*
	*/
	public Digraph(int vertices) {
		size = vertices;
	}

	/**
	* Metodo para añadir un arco nuevo, donde se representa cada nodo con un entero
	* y se le asigna un peso a la longitud entre un nodo fuente y uno destino	
	* @param source desde donde se hara el arco
	* @param destination hacia donde va el arco
	* @param weight el peso de la longitud entre source y destination
	*/
	public abstract void addArc(int source, int destination, int weight);

	/**
	* Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
	* asociados al nodo pasado como argumento
	* @param vertex nodo al cual se le busca los asociados o hijos
	* @return todos los asociados o hijos del nodo vertex, listados en una ArrayList
	* Para más información de las clases:
 	* @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
	*/
	public abstract ArrayList<Integer> getSuccessors(int vertex);

	/**
	* Metodo para obtener el peso o longitud entre dos nodos
	* 
	* @param source desde donde inicia el arco
	* @param destination  donde termina el arco
	* @return un entero con dicho peso
	*/	
	public abstract int getWeight(int source, int destination);


	/**
	* Metodo que tiene la intencion de retornar el tamaño del grafo
	* @return tamaño del grafo
	*/
	public int size() {
		return size;
	}
}
