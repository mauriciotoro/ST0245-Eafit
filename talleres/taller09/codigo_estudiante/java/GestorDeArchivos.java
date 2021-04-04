import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.*;
import java.util.HashMap;

class GestorDeArchivos{

 public static void main(String[] args) throws IOException, ClassNotFoundException {
  //  Cargar el archivo CSV desde el computador 
  Path ruta = Paths.get("archivoDescargado.csv");
  String texto_del_archivoCSV = Files.readString(ruta, StandardCharsets.UTF_8);
  
  // Dividir un archivo CSV en líneas
  String[] lineas_del_texto_del_archivoCSV = texto_del_archivoCSV.split("\n");

  //  Generar una tabla de hash con el contenido dividido en lineas
  HashMap<String,String> tabla_de_hash = new HashMap<String, String>();
  int i = 0;
  for (String linea : lineas_del_texto_del_archivoCSV ){
  	if (i != 0){ // Descarta la primera línea, ok? 
      String[] columnas = linea.split(",");
      String nombre_y_apellido = columnas[1]+" "+columnas[0];
      String telefono = columnas[3];
      tabla_de_hash.put(nombre_y_apellido,  telefono);
    }
    i++;
  }

  // Guardar una tabla de hash en un archivo
  FileOutputStream fos = new FileOutputStream("diccionario.txt");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(tabla_de_hash);
  oos.close();
  fos.close();

  // Cargar una tabla de hash desde un archivo
  FileInputStream fis = new FileInputStream("diccionario.txt");
  ObjectInputStream ois = new ObjectInputStream(fis);
  tabla_de_hash = (HashMap<String,String>) ois.readObject();
  ois.close();
  fis.close();

  // Imprimir una tabla de hash
  for ( String nombre_y_apellido  : tabla_de_hash.keySet() ) 
    System.out.println( nombre_y_apellido + " " + tabla_de_hash.get(nombre_y_apellido));
 }
}