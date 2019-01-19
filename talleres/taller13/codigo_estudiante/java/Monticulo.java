
public class Monticulo {
   
   	// Variables de la clase Monticulo
   	int[] monticulo;
   	int numElementos;
   	int maxElementos;
   

   	/** Constructor de la clase Monticulo que genera un objeto de tipo Monticulo pasando por parametro
   	/   el numero de elementos y el numero maximo
   	*/
  	 public Monticulo (int num, int max) {
     
  	 }
   
   	/** Constructor de la clase Monticulo que genera un objeto de tipo Monticulo pasando por parametro un vector
   	/
   	/
   	*/

    public Monticulo (int[] vector, int max) {
    
    }

    //devuelve cierto si el montículo está vacío.
    public boolean EmptyHeap() {
   
 	}

 	//reubica el elemento i-esimo del vector en caso de que este sea mayor que el
	//padre (montículo de maximos).
 	public void flotar (int elemento) {
 
    
   	}
 	
 	//reubica el elemento i-esimo del vector en caso de que éste sea menor que alguno
	//de sus hijos. En tal caso, intercambia su valor por el del mayor de sus hijos (montículo de máximos).
   	public void hundir (int elemento) {
    
 	}

 	//inserta un elemento en el montículo y lo flota hasta restaurar la propiedad de
	//montículo.
   	public void insert(int elemento) {
    
    }

    //devuelve la cima del montículo sin modificarlo.
    public int first() {
    

 	}

 	//devuelve la cima del montículo, la elimina del mismo y recompone la
	//propiedad de montículo.
 	public int peek() {
 
    }

   
}