public class Nodo{

public TreeSet<String> sacarLosValoresDiferentesSinRepetirDeUnaVariable(String[][] m, int posVariable){
	TreeSet<String> respuesta = new TreeSet();
	for (int fila = 0; fila < m.length; fila)
		respuesta.add(m[fila][posVariable]);
	return respuesta;
}

public Pair<int,String> encontrarEnQuePosEstaLaMejorVariableYQueValorDeboCompararEnLaCondicion(String[][] m){
	float laImpurezaMenorDentreTodoElmundo = 1;
	String elMejorValorDentreTodoElMundo = "";
	int laPosDeLaVariableDondeEstaElMejorValor = -1;
	for (int columna = 0; columna < m[0].length - 1; columna++)
		TreeSet<String> valores = sacarLosValoresDiferentesSinRepetirDeUnaVariable(m, columna);
		for (String unValor : valores)
			float impurezaPonderadaDeEstaColumnaConEsteValor = calcularLaImpurezaPonderada(m, columna, unValor);
			if (impurezaPonderadaDeEstaColumnaConEsteValor < laImpurezaMenorDentreTodoElmundo){
				laImpurezaMenorDentreTodoElmundo = impurezaPonderadaDeEstaColumnaConEsteValor;
				elMejorValorDentreTodoElMundo = unValor;
				laPosDeLaVariableDondeEstaElMejorValor = columna;
			}
	Pair<int,String> respuesta = new Pair(laPosDeLaVariableDondeEstaElMejorValor, elMejorValorDentreTodoElMundo);
	return respuesta;
}

// IG = 1 - (p0)^2 - (p1)^2. P0 = exito/total P1 = NoExito/total
public float laImpurezaDeLosDatosDeUnaMatriz(String[][] m){
	int losQueTienenExito = 0;
	for (int fila = 0; fila < m.length; fila++)
		if (m[fila][m[0].length-1].equals("1"))
			losQueTienenExito++;
	int losQueNoTienenExito = m.length - losQueTienenExito;
	float proporcionDeLosQueTienenExito = losQueTienenExito/m.length;
	float proporcionDeLosQueNoTieneExito = losQueNoTienenExito/m.length;
	float impureza = 1 - 	proporcionDeLosQueTienenExito*proporcionDeLosQueTienenExito - proporcionDeLosQueNoTienenExito*proporcionDeLosQueNoTienenExito;
	return impureza;		
}

// IP = (Iizq*cuantosHayALaIzquierda + Ider*cuantosHayALaDerecha) / El numero total de datos
public  float calcularLaImpurezaPonderada(String[][] m, int posVariable, String valor){
    int enCuantosEstudiantesLaVariableEsIgualAlValor = 0;
    for (int fila = 0; fila < m.length; fila++)
        if (m[fila][posVariable] == valor) // por ejemplo, valor es 3, 10 SMLVM, Masculino
            enCuantosEstudiantesLaVariableEsIgualAlValor++;
    int enCuantosEstudiantesLaVariableNOEsIgualAlValor = m.length - enCuantosEstudiantesLaVariableEsIgualAlValor;
    String[][] matrizLaVariableEsIgualAlValor = new String[enCuantosEstudiantesLaVariableEsIgualAlValor][m[0].length];
    String[][] matrizLaVariableNOEsIgualAlValor = new String[enCuantosEstudiantesLaVariableNOEsIgualAlValor][m[0].length];
    // Copiar los datos a las matrices
    int fila = 0;
    int filaN1 = 0;
    int filaN2=0
    while(fila<m.length)
    {
        if(m[fila][posVariable]==valor)
        {
            matrizLaVariableEsIgualAlValor[filaN1]=m[fila];
            fila++;filaN1++;
        }else
        {
            matrizLaVariableNOEsIgualAlValor[filaN2]=m[fila];
            fila++;filaN2++;
        }
    }
    // ...
	float impurezaPonderada = ...;
        return impurezaPonderada;
    }
}
 

public  Pair<String[][],String[][]> dividirUnaMatrizEnDosMatrices(String[][] m, int posVariable, String valor){
    int enCuantosEstudiantesLaVariableEsIgualAlValor = 0;
    for (int fila = 0; fila < m.length; fila++)
        if (m[fila][posVariable] == valor) // por ejemplo, valor es 3, 10 SMLVM, Masculino
            enCuantosEstudiantesLaVariableEsIgualAlValor++;
    int enCuantosEstudiantesLaVariableNOEsIgualAlValor = m.length - enCuantosEstudiantesLaVariableEsIgualAlValor;
    String[][] matrizLaVariableEsIgualAlValor = new String[enCuantosEstudiantesLaVariableEsIgualAlValor][m[0].length];
    String[][] matrizLaVariableNOEsIgualAlValor = new String[enCuantosEstudiantesLaVariableNOEsIgualAlValor][m[0].length];
    // Copiar los datos a las matrices
    int fila = 0;
    int filaN1 = 0;
    int filaN2=0
    while(fila<m.length)
    {
        if(m[fila][posVariable]==valor)
        {
            matrizLaVariableEsIgualAlValor[filaN1]=m[fila];
            fila++;filaN1++;
        }else
        {
            matrizLaVariableNOEsIgualAlValor[filaN2]=m[fila];
            fila++;filaN2++;
        }
    }
    // ...
        Pair<String[][],String[][]> parejaDeMatrices = new Pair(matrizLaVariableEsIgualAlValor,matrizLaVariableNOEsIgualAlValor);
        return parejaDeMatrices;
    }
}