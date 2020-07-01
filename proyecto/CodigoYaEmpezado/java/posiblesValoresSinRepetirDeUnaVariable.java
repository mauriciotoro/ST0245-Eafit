public class Arbol {

	public static TreeSet<String> posiblesValoresSinRepetirDeUnaVariable(String[][] m, int variable){
             TreeSet<String> respuesta = new TreeSet();
	     for (int fila = 0; fija < m.length; fila++)
		respuesta.add(m[fila][variable]);
	     return respuesta;
        }
	public static void recorrerVariables(String[][] m)	
         for (int variable = 0; variable < m[0].length - 1; variable++)
           for (String valor : posiblesValoresSinRepetirDeUnaVariable(m,variable))
		calcularElGiniPonderado(m, variable, valor);
        }
}