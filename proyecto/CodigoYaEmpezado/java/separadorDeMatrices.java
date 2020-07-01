import javafx.util.Pair;
class Proyecto {
  public static Pair<Float, Float> elGiniPorVariableQueRecomiendaDaniela(String[][] m, int variable,  String valor){
      Pair<String[][], String[][]> pareja = separador(m, variable, valor);
      float elGiniCuandoEsVerdadero = sacarElGiniDeUnaMatriz(pareja.getKet());
      float elGiniCuandoEsFalso = sacarElGiniDeUnaMatriz(pareja.getValue());
      float giniPonderado = (elGiniCuandoEsVerdadero*pareja.getKey().length + elGiniCuandoEsFalso*pareja.getValue().length) / m.length; 
  }

  public static float sacarElGiniDeUnaMatriz(String[][] m){ // IG = 1 - (p0)^2 - (p1)^2
	int enCuantasFilasElExitoEsFalsoEsDecir0 = enCuantasFilasLaVariableEsIgualALaCondicion(m, m[0].length-1, "0");
        int enCuantasFilasElExitoEsVerdaderoEsDecir1 = m.length - enCuantasFilasElExitoEsFalsoEsDecir0;
	float gini = 1 - Math.pow(enCuantasFilasElExitoEsFalsoEsDecir0/m.length,2) - Math.pow(enCuantasFilasElExitoEsVerdaderoEsDecir1/m.length,2);
	return gini; 
  }

  private static int enCuantasFilasLaVariableEsIgualALaCondicion(String[][] m, int variable, String valor){
      int enCuantasFilasLaVariableEsIgualALaCondicion = 0;
      for (int filas = 0; filas < m.length; filas++)
	if (m[fila][variable].equals(valor))
	   enCuantasFilasLaVariableEsIgualALaCondicion++;
      return enCuantasFilasLaVariableEsIgualALaCondicion;	     
  }
  private static void meterLasFilasQueCorrespondenACadaMatriz(String[][] m, String[][] matrizCuandoDaVerdadero, String[][] matrizCuandoDaFalso){ // Xtreme Programming
      int laUltimaFilaVerdadero = 0;	
      int laUltimaFilaFalso = 0;
      for (int filas = 0; filas < m.length; filas++)
	if (m[fila][variable].equals(valor))
	   matrizCuandoDaVerdadero[laUltimaFilaVerdadero++] = m[fila];
	else
 	   matrizCuandoDaFalso[laUltimaFilaFalso++] = m[fila];
  }
  public static Pair<String[][], String[][]> separador(String[][] m, int variable, String valor){
      int enCuantasFilasLaVariableEsIgualALaCondicion = enCuantasFilasLaVariableEsIgualALaCondicion(m, variable, valor);
      String[][] matrizCuandoDaVerdadero = new String[enCuantasFilasLaVariableEsIgualALaCondicion][m[0].length];
      String[][] matrizCuandoDaFalso = new String[m.length - enCuantasFilasLaVariableEsIgualALaCondicion][m[0].length];
      meterLasFilasQueCorrespondenACadaMatriz(m,matrizCuandoDaVerdadero,matrizCuandoDaFalso);
      return new Pair(matrizCuandoDaVerdadero, matrizCuandoDaFalso);
  }
}