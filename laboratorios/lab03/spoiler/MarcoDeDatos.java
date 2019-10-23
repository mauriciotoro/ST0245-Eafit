
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

/**
 * Esta clase permite organizar y disttibuir 
 * correctamente ls datos para crear un LinkedList
 * donde cada posición tiene una variable 
 * de tipo Dato
 */ 
public class MarcoDeDatos
{
    /** LinkedList donde se almacenan los datos leidos **/
    LinkedList<Dato> al = new LinkedList<>();

    /** 
     * Este método recibe el nombre del archivo que se va a leer.
     * Se trata de abrir el archivo, si se puede abrir, se leen y se muestran impresos los
     * datos y se retornan en un LinkedList que almacena referencias a 
     * objetos tipo Dato.
     */
    public LinkedList<Dato> leerDatos(String nombre) {

        try {
            Scanner archivo = new Scanner(new File(nombre));

            while(archivo.hasNextLine()) {
                String linea = archivo.nextLine();
                if(linea.length()>1) {
                    //linea+= ", ";

                    Scanner registro = new Scanner(linea.replaceAll(",,,", ",").replaceAll("\"2,","\"2.").replaceAll("\"0,","\"0.").replaceAll("\"1,","\"0.").replaceAll(",,", ",")
                            .replaceAll("\"", "").replaceAll("NULL", ""));
                    registro.useDelimiter(",");
                    //registro.useDelimiter("\"");

                    String nombre_ = registro.next();
                    String codigo1 = registro.next();
                    String codMateria = registro.next();
                    String semestre = registro.next();
                    String grupo1 = registro.next(); 
                    String evaluacion = registro.next();
                    String porcentaje1 = registro.next();
                    String descripcion = registro.next();
                    String materia = registro.next();
                    String nota1 = registro.next();
                    String definitiva1 = registro.next();

                    int codigo;
                    int grupo;
                    double porcentaje;
                    int nota;
                    int definitiva;

                    if (codigo1.isEmpty()) codigo1 = "  X";

                    if (grupo1.isEmpty()) grupo1 = "  X";

                    if (porcentaje1.isEmpty()) porcentaje1 = "  X";

                    if (nota1.isEmpty()) nota1 = "  X";

                    if (definitiva1.isEmpty()) definitiva1 = "  X";

                    if (codigo1.equals("  X")) codigo = -1000;
                    else codigo = Integer.parseInt(codigo1);

                    if (grupo1.equals("  X")) grupo = -10000;
                    else grupo = Integer.parseInt(grupo1);

                    if (porcentaje1.equals("  X")) porcentaje = -10000;
                    else porcentaje = Double.parseDouble(porcentaje1);

                    if (nota1.equals("  X")) nota = -10000;
                    else nota = Integer.parseInt(nota1);

                    if (definitiva1.equals("  X")) definitiva = -10000;
                    else definitiva = Integer.parseInt(definitiva1);

                   //System.out.println(nombre_ + "    "  + codigo1 + "    " + codMateria + "    " + semestre + "    " + grupo1 + "    " + evaluacion + "    " + porcentaje1 + "    " + 
                        //descripcion + "    " + materia + "    " + nota1 + "    " + definitiva1); //Antes estaba comentado

                    Dato dato = new Dato(nombre_, codigo, codMateria, semestre, grupo, evaluacion, porcentaje, descripcion, materia, nota, definitiva);
                    al.add(dato);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No pude abrir el archivo");
        }
        return al;
    }
    
      
    /**
     * Programa principal.
     * Se leen los datos almacenados en el archivo "datos.txt" y se
     * guardan en el LinkedList "al".
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
