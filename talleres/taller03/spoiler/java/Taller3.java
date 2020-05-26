/**
 *
 * La clase Taller3 tiene como objtivo dar solución a los puntos del taller 3
 *
 * @author Mauricio Toro, Andrés Páez, Daniel Mesa
 * @version 2
 */

//Nota: Hacen falta algunas partes de las lineas de codigo, estas estan indicadas con una linea, ¡debes completarlas!
public class Taller3 {

    /**
     *
     * El método torresDeHannoi es un auxiliar del proceso 
     * @param n numero de discos
     * 
     */	
	
    public static void torresDeHannoi(int n) {
	torresDeHannoiAux(n, 1, 2, 3);
    }

    /**
     *
     * El método torresDeHannoi es un auxiliar del proceso 
     * @param n numero de discos
     * @param origen la torre número uno donde se posicionan todos los discos inicialmente
     * @param destino la torre donde deben posicionarse todos los discos terminado el proceso
     * @param intermedio torre auxiliar para que el cambio de torres se haga efectivo
     * 
     * debe devolver la secuencia de pasos en consola de esta manera:
     * System.out.println("Disk "+ n + " from "+ origen + " to "+ destino);
     *
     * @see <a href="http://www.uterra.com/juegos/torre_hanoi.php"> Simulación del funcionamiento</a>
     * @see <a href="https://es.wikipedia.org/wiki/Torres_de_Han%C3%B3i"> Un poco de historia </a>
     */	
	
    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
	if(n ____ 1)
	    {   
		System.out.println("Disk 1 from "+ origen + " to "+ destino);
	    }
	else {
	    torresDeHannoiAux(n ___ 1, origen, _______, __________);
	    System.out.println("Disk "+ n + " from "+ origen + " to "+ destino);
	    torresDeHannoiAux(n _______ 1, intermedio, origen, destino);
	}
    }
		
		
    /**
     *
     * El método combinations es un auxiliar del proceso 
     * @param s es la cadena a permutar
     */
    public static void combinations(String s) { 
	combinationsAux("", s); 
    }

    /**
     *
     * El método combinationsAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena s 
     * @param s es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *
     * Las cadenas de salida tienes una longitud desde 0 hasta el lenght de la cadena s
     * por simplicidad del ejercicio no se repiten letras y el orden de la secuencia 
     * no supone importancia, es decir, la cadena AB es igual a la cadena BA.
     * Ej: para la cadena ABC se tiene la salida: { A, AB, ABC, AC, B, BC, C}
     *
     */
    private static void combinationsAux(String prefix, String s) {  
	if (s.length() _____ 0) { 
	    System.out.println(prefix _____ s.charAt(0));   
	    combinationsAux(______ + s.charAt(0), s.substring(1)); 
	    combinationsAux( _______ , ________);        
	}
    }
		
		
    /**
     *
     * El método permutation es un auxiliar del proceso 
     * @param str es la cadena a permutar
     */
    public static void permutation(String str) {
	permutation("", str); 
    }
	
    /**
     *
     * El método permutationAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena str 
     * @param str es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *
     * Las cadenas de salida tienes una longitud de lenght de la cadena s
     * Ej: para la cadena AB se tiene la salida: { ABC,ACB,BAC,BCA,CAB,CBA }
     * donde los caracteres no se repiten pero el orden tiene un papel importante.
     *
     */
    private static void permutationAux(String prefix, String str) {
	int n = _________;
	if (n ______ 0)
	    System.out.println(prefix);
	else {
	    for (int i = 0; i _____ n; i++)
		permutation( _________________ , str.substring(0, i) + str.substring( _____ , n));
	}
    }
		
	
}
