
import java.util.Scanner;

public class EjScanner {
    public static void  main(String[] args){
       Scanner leer = new Scanner(System.in);
       lectura(leer);
    }
    
    public static void lectura(Scanner leer){
        int x = leer.nextInt();
        leer.nextLine();
        if(x == 0) {}
        String linea;
        if(x >= 6 || x <= 300 ||x % 2 == 0){
            while (true){
               linea = leer.nextLine();
               if(linea.equals("0 0")) break;
            }
        }   
    } 
}
