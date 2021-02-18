class Tiempos {
public static void main(String[] args) {
for (int i = 20; i < 40; i++) {
long inicio = System.currentTimeMillis();
System.out.println(fibonacci(i));
long fin = System.currentTimeMillis();
long total = fin - inicio;

System.out.println("El tiempo total fue de " + total + " ms");
}
}

public static int fibonacci(int n) {
if (n == 0) {
return 0;
} else if (n == 1) {
return 1;
} else {
return fibonacci(n-1) + fibonacci(n-2);
}
}
}
