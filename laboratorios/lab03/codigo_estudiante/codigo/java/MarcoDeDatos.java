
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

/**
 * Esta clase permite organizar y disttibuir 
 * correctamente ls datos para crear un ?????
 * donde cada posición tiene una variable 
 * de tipo Dato
 */ 
public class MarcoDeDatos
{
    /** ????? donde se almacenan los datos leidos **/
    ?????<Dato> al = new ?????<>();

    /** 
     * Este método recibe el nombre del archivo que se va a leer.
     * Se trata de abrir el archivo, si se puede abrir, se leen y se muestran impresos los
     * datos y se retornan en un ????? que almacena referencias a 
     * objetos tipo Dato.
     */
    public ?????<Dato> leerDatos(String nombre) {
	...
    }
    
      
    /**
     * Programa principal.
     * Se leen los datos almacenados en el archivo "datos.txt"
     **/
    public static void main(String [] args) {
        MarcoDeDatos ldd = new MarcoDeDatos();
        System.out.println("Voy a leer los datos");
        ldd.leerDatos("NOTAS ST0242.csv");
        ldd.leerDatos("NOTAS ST0245.csv");
        ldd.leerDatos("NOTAS ST0247.csv");
        System.out.println("Ya leí los datos");
    }
}
