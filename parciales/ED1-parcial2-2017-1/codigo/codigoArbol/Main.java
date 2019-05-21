import java.io.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main{

    static boolean estaOrdenado(int[] a) {
	for (int i = 0; i < a.length - 1; i++)
	    if (a[i] > a[i + 1]) 
		return false;
	return true;
    }

    static void cambiar(int[] arr, int i, int k) {
	int t = arr[i];
	arr[i] = arr[k];
	arr[k] = t;
    }

    static void ordenar(int[] arr, int k) {
	for (int i = k; i < arr.length; i++) {
	    cambiar(arr, i, k);
	    if (estaOrdenado(arr))
		 System.out.println(Arrays.toString(arr));
		//return;
	    ordenar(arr, k+1);
	    cambiar(arr, k, i);
	}	    
    }

    static int[] aleatorio(int n, int bound) {
	int[] arr = new int[n];
	for (int i = 0; i < n; i++)
	    arr[i] = ThreadLocalRandom.current().nextInt(bound);
	return arr;
    }

    static int[] copiar(int[] other) {
	int[] arr = new int[other.length];
	for (int i = 0; i < other.length; i++)
	    arr[i] = other[i];
	return arr;
    }

    static boolean comparar(int[] a, int[] b) {
	int n = a.length; 
	if (n != b.length) return false;
	for (int i = 0; i < n; i++)
	    if (a[i] != b[i]) return false;
	return true;
    }
    
    public static void main(String[] args) {
	int max = 10;
	int iteraciones = 1000;
	boolean valido = true;
	for (int i = 0; i < max && valido; i++) {	    
	    int[] arr = aleatorio(max, 20);
	    int[] copia = copiar(arr);
	    Arrays.sort(arr);
	    ordenar(copia, 0);
	    if (!comparar(arr, copia))  {
		System.out.println("Bueno:" + Arrays.toString(arr));
		System.out.println("Nuestro: " + Arrays.toString(copia));
		valido = false;
	    }
	}
	System.out.println(valido);
    }

}
