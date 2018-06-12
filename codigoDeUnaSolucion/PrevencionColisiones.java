import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import javafx.geometry.Point3D;
import java.util.ArrayList;
import java.lang.Math;
/**
 * Algoritmo para prevenir Colisiones
 * Estructura de datos utilizada: Arreglos
 * Complejidad: Peor Caso y Mejor caso = O(n al cubo)
 *
 * @author Mauricio Toro
 * @version 1
 */
public class PrevencionColisiones
{
    /**
    * Metodo para aproximar la distancia entre dos abejas roboticas
    *
    * @param  abeja1  la primera abeja
    * @param  abeja2  la segunda abeja
    * @return    la distancia aproximada entre las dos abejas suponiendo que 1 grado son 111111 metros
    */
    private static double distancia(Point3D abeja1, Point3D abeja2){
        return Math.sqrt(  Math.pow((abeja1.getX() - abeja2.getX())*111111,2) +
                           Math.pow((abeja1.getY() - abeja2.getY())*111111,2) +
                           Math.pow(abeja1.getZ() - abeja2.getZ(),2)
                        );
    }
     
    public static void main(String[] args){
            String nombreDelArchivo = "ConjuntoDeDatosCon10abejas.txt";
            final int numeroDeAbejas = 10;
            Point3D[] arregloDeAbejas = new Point3D[numeroDeAbejas];
          try {            
            BufferedReader br = new BufferedReader(new FileReader(nombreDelArchivo));
            String lineaActual = br.readLine();
            lineaActual = br.readLine(); // Descarta la primera linea
            int index = 0;
            // Leer el archivo con las coordenadas de las abejas
            while (lineaActual != null){ // Mientras no llegue al fin del archivo
                String [] cadenaParticionada = lineaActual.split(",");
                Point3D abeja = new Point3D(Double.parseDouble(cadenaParticionada[0]),
                                            Double.parseDouble(cadenaParticionada[1]),
                                            Double.parseDouble(cadenaParticionada[2]));
                arregloDeAbejas[index++] = abeja;
                lineaActual = br.readLine();
            }
          }
          catch(IOException ioe) {
              System.out.println("Error leyendo el archivo de entrada");
          }
          // Prevenir las colisiones revisando todas con todas
          ArrayList<Point3D> abejasConRiesgoDeColision = new ArrayList();
          for (int i = 0; i < numeroDeAbejas; ++i)
              for(int j = i+1; j < numeroDeAbejas; ++j)
                if (distancia(arregloDeAbejas[i], arregloDeAbejas[j]) <= 100){
                   abejasConRiesgoDeColision.add(arregloDeAbejas[i]);
                   abejasConRiesgoDeColision.add(arregloDeAbejas[j]);
                }
          // Guardar en un archivo las abejas con riesgo de colision   
          try {
             PrintWriter escritor = new PrintWriter("respuestas"+nombreDelArchivo, "UTF-8");
             for (Point3D abeja : abejasConRiesgoDeColision)
                escritor.println(abeja.getX()+","+abeja.getY()+","+abeja.getZ());
             escritor.close();
          }
          catch(IOException ioe) {
              System.out.println("Error escribiendo el archivo de salida");
          }          
   }
    }

