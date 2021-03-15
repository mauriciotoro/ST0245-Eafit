import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generarArreglo(50)));
    }

    public static int [] generarArreglo(int n) {
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random()*10);
        }
        return arr;
    }
}