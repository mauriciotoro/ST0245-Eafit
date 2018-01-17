package Taller__3;



public class TestTaller3 {
	
	public static void ejercicio1(){
		System.out.println("Para 2 discos la secuencia debe quedar as�");
		System.out.println("Disco 1 de 1 a 2   \nDisco 2 de 1 a 3  \nDisco 1 de 2 a 3");
		Taller3.torresDeHannoi(2);


		System.out.println("Para 3 discos la secuencia debe quedar as�");
		System.out.println("Disco 1 de 1 a 3  \nDisco 2 de 1 a 2  \nDisco 1 de 3 a 2  \nDisco 3 de 1 a 3  \nDisco 1 de 2 a 1  \nDisco 2 de 2 a 3  \nDisco 1 de 1 a 3  \n");
		Taller3.torresDeHannoi(3);


		System.out.println("Para 4 discos la secuencia debe quedar as�");
		System.out.println("Disco 1 de 1 a 2  \nDisco 2 de 1 a 3  \nDisco 1 de 2 a 3  \nDisco 3 de 1 a 2  \nDisco 1 de 3 a 1  \nDisco 2 de 3 a 2  \nDisco 1 de 1 a 2  \nDisco 4 de 1 a 3  \nDisco 1 de 2 a 3  \nDisco 2 de 2 a 1  \nDisco 1 de 3 a 1  \nDisco 3 de 2 a 3  \nDisco 1 de 1 a 2  \nDisco 2 de 1 a 3  \nDisco 1 de 2 a 3  \n");
		Taller3.torresDeHannoi(4);

	}

	
	public static void ejercicio2(){
		System.out.println("Para la cadena 'abc' las combinacioens deben ser similar a:");
		System.out.println("a, ab, abc, ac, b, bc, c");
		Taller3.combinations("abc");

		System.out.println("Para la cadena 'Eafit' las combinacioens deben ser similar a:");
		System.out.println("E, Ea, Eaf, Eafi, Eafit, Eaft, Eai, Eait, Eat, Ef, Efi, Efit, Eft, Ei, Eit, Et, a, af, afi, afit, aft, ai, ait, at, f, fi, fit, ft, i, it, t");
		Taller3.combinations("Eafit");
		
		System.out.println("Para la cadena 'Hola' las combinacioens deben ser similar a:");
		System.out.println("H, Ho, Hol, Hola, Hoa, Hl, Hla, Ha, o, ol, ola, oa, l, la, a");
		Taller3.combinations("Hola");

		System.out.println("Para la cadena 'Hi' las combinacioens deben ser similar a:");
		System.out.println("a, ab, abc, ac, b, bc, c");
		Taller3.combinations("H, Hi, i");
	}
	
	
	public static void ejercicio3(){
		System.out.println("Las permutaciones de la cadena 'abc' son:");
		System.out.println("abc, acb, bac, bca, cab, cba");
		System.out.println("");
		Taller3.permutation("abc");

		System.out.println("Las permutaciones de la cadena 'Hola' son:");
		System.out.println("Hola, Hoal, Hloa, Hlao, Haol, Halo, oHla, oHal, olHa, olaH, oaHl, oalH, lHoa, lHao, loHa, loaH, laHo, laoH, aHol, aHlo, aoHl, aolH, alHo, aloH");
		System.out.println("");
		Taller3.permutation("Hola");

		System.out.println("Las permutaciones de la cadena 'Dato' son:");
		System.out.println("Dato, Daot, Dtao, Dtoa, Doat, Dota, aDto, aDot, atDo, atoD, aoDt, aotD, tDao, tDoa, taDo, taoD, toDa, toaD, oDat, oDta, oaDt, oatD, otDa, otaD");
		System.out.println("");
		Taller3.permutation("Dato");
	}
	
	
	public static void main(String[] args){	
        //Ejercicio1
		System.out.println("");
        System.out.println("Ejercicio 1");
        ejercicio1();
        
        //Ejercicio2
        System.out.println("");
        System.out.println("Ejercicio 2");
        ejercicio2();
        
        //Ejercicio3
        System.out.println("");
        System.out.println("Ejercicio 3");
        ejercicio3();
    }
}
