/**
 *La clase taller dos tiene como objetivo dar solución
 *a 3 problemas recursivos
 *
 *@autor Mauricio Toro, Camilo Paez, Daniel Mesa
 *@version 2
 */
//Nota: Hacen falta algunas partes de las lineas de codigo, estas estan indicadas con una linea, ¡debes completarlas!
public class Taller2 {

    /**
     * @param p entrada 1 entero positivo, mayor que q
     * @param q entrada 2 entero positivo, menor que p
     *
     * El método gcd tiene como objetivo ecnontrar el
     * máximo común divisor de dos números, por medio del
     * algoritmo de euclides
     * @see <a href="https://www.youtube.com/watch?v=Q9HjeFD62Uk"> Explicación </a>
     * @see <a href="https://visualgo.net/en/recursion"> Funcionamiento </a>
     *
     * @return el máximo común divisor
     */
    public static int gcd(int p, int q){
	int res=p _ q;
	if (res  __  0)
	    return q;
	return gcd(q, _____);
    }


    /**
     * @param start entrada 1 entero positivo, determina un índice dentro del proceso
     * @param nums entrada 2 arreglo de enteros positivos, sobre el cual vamos a interar
     * @param target entrada 3 entero positivo, determina el valor de referencia
     * El método SumaGrupo tiene como objetivo darnos a conocer si hay
     * algun subconjunto el cual su suma = target.
     *
     *
     * @return verdadero si hay un subconjunto el cual su suma = target
     */
    public static boolean SumaGrupo(int start, int[] nums, int target) {
	if(start ___ nums.length){
	    return target == 0;
	}
        else
            return sumaGrupo(start + __, nums, target) || sumaGrupo( start+1, nums, target ___ nums[start]);
    }

    /**
     * @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
     *
     * El método combinations se define para que solo se tenga que pasar el parametro s y no la cadena
     * vacía necesaria para el metodo reursivo combinationsAux. Este metodo no se modifica.
     *
     */
    public static void combinations(String s) {
	combinationsAux("", s);
    }

    /**
     * @param prefix, se utiliza como una variable auxiliar para guardar datos sobre el proceso.
     * @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
     *
     *
     * El método combinationsAux se encarga de encontrar las posibles combinaciones en la cadena s
     * notese que el método es "private" de modo que solo se puede llamar desde el interior de la clase pues
     * el método que lo representa es combinations.
     * Para más detalles sobre modificadores de acceso:
     * @see <a href="http://ayudasprogramacionweb.blogspot.com/2013/02/modificadores-acceso-public-protected-private-java.html"> modificadores </a>
     *
     */

    private static void combinationsAux(String prefix, String s) {
	if(s.length() ___ 0) {
	    System.out.println( ________ );
	}else{
	    combinationsAux( _______ + s.charAt(0), s.substring(1));
	    combinationsAux( prefix, s.substring( __ ));
	}
    }

}
