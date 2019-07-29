/**
 * La clase Taller4 tiene la intención de resolver el taller número 4.
 *
 * @author Mauricio Toro, Andres Paez, Daniel Mesa
 * @version 2
 */

//Nota: Hacen falta algunas partes de las lineas de codigo, estas estan indicadas con una linea, ¡debes completarlas!
public class Taller4 {



    /**
     * @param array es una arreglo de numeros enteros.
     * El método suma tiene la intención de hacer el proceso de suma
     * mediante una funcion cíclica (while/for/...)
     * @return la suma de todos los numeros sumados.
     */
    public static int suma (int[]array){
	int sum=0;
	for(int i=0;i< __________ ;i++){
	    sum+=array[i];
	}
        return sum;
    }


    /**
     * @param num es el numero el cual se utiliza para ser multiplicado.
     * El método mul tiene la intención de hacer la multiplicación
     * de 1 a n por el numero mul
     * mediante una funcion cíclica (while/for/...)
     *
     */
    public static void mul (int num){
	for(int i=1;i<=10;i++){
	    System.out.println(num+" x "+i+" = "+( ____ ));
	}
    }


    /**
     * @param array es un arreglo de números desordenados
     * El método insertionSort tiene la intención ordenar los números
     * del arreglo array por el método insertion:
     * @see <a href="https://www.youtube.com/watch?v=OGzPmgsI-pQ"> Insertion Sort <a/>
     * mediante la anidación de funciones cíclicas (while/for/...)
     *
     */
    public static int[] insertionSort (int[] array){
	int j=0;
	int temp=0;
	for(int i=0;i<array.length;i++){
	    _____ = i;
	    _____ = array[j];
	    while(j > 0 _____ array[ ____ ] > temp){
		array[j] = array[j-1];
		j __ ;
	    }
	    array[j] = temp;
	}
	return array;
    }
}
