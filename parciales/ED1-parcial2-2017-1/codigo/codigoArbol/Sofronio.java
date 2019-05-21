import java.lang.Math;
public class Sofronio{
public static int solucionar(int n, int a, int b, int c){
	//Claramente si n es menor que los otros valores, no se puede obtener ninguna
	//combinacion.
	if(n == 0 ){
		return 0;
	}
	//Probemos restando el valor de "a" a n.
	int res = solucionar(n - a, a, b, c) + 1;
	//Maximicemos el resultado quitandole b a n.
	res = Math.max(res, solucionar(n - b, a, b, c) + 1);
	//Maximicemos el resultado quitandole c a n.
	res = Math.max(res, solucionar(n -c, a, b, c) + 1);	
	return res;
}
 }