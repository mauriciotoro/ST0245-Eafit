/**
 *La clase Taller5 dos tiene como objetivo dar solución al taller5
 *
 *@autor Mauricio Toro, Camilo Paez
 *@version 1
 */
//Nota: Hacen falta algunas partes de las lineas de codigo, estas estan indicadas con una linea, ¡debes completarlas!
public class Taller5 {
    
    
    /**
     * @param array es un arreglo de numeros enteros
     * @param n la longitud del array anterior 
     *
     *en este método se busca hacer la suma de los numeros en un
     *arreglo de forma recursiva.
     *
     * @return la suma
     */
    public static int arrayMax(int[] array, int n) {
	int i, max, temp;
	max = array[ ____ ];
	if(n ____ 0){
	    temp = arrayMax(array, _____ );
	    if(temp ____ max)
		max = temp;
	}
	return max;
    }
    
    /**
     * @param start es un contador, nos sirve para saber cuando debemos parar
     * @param array es un arreglo de numeros enteros, representan volumen
     * @param target es la meta, el numero que debe alacanzar la suma 
     *
     * en este método se busca hacer la suma de los volumnes posibles
     * de modo que se acomode de tal forma que se alcance el valor target
     * pista: la clave esta en el numero de elementos y que no siempre se toman
     * los elementos, en ocaciones pasan por ejemplo en un conjuntos [5,6,7,8] para un
     * target 12 se toman el 5 y el 7 pasando por 6 sin cogerlo.
     *
     *
     * @return verdadero si hay una combinación que suponga el valor target, falso de lo contrario
     */
    public static boolean groupSum(int start, int[] nums, int target) {
	if (start _____ nums.length) return target == 0;
	return groupSum(start + 1, nums, target - nums[ ______ ])
	    || groupSum( ________ , nums, _______ );
    }
	
	
    /**
     * @param n numero entero, hasta que numero se hace la serie
     *
     * el metodo se encarga de devolvernos el valor fibonacci en la enesima posicion
     * @see <a href="https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci"> fibonnaci <a/>
     * @return el valor encontrado en long dada la posible cantidad de bits
     */
    public static long fibonacci(int n) { 
	if (n <= 1) 
	    return _____ ;  
	else 
	    return __________ + fibonacci(n-2);
    }
}
