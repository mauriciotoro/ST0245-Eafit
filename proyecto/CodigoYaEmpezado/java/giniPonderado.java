class Nodo{

   public float calcularElGiniPonderado(String[][] laMatrizDelNodoDeLaIzquierda, String[][] laMatrizDelNodoDeLaDerecha){
	float elGiniDeLaMatrizDeLaIzquierda = sacarGini(laMatrizDelNodoDeLaIzquierda);
	float elGiniDeLaMatrizDeLaDerecha = sacarGini(laMatrizDelNodoDeLaDerecha);
	float elGiniPonderado = (elGiniDeLaMatrizDeLaIzquierda*laMatrizDelNodoDeLaIzquierda.length + 
                                 elGiniDeLaMatrizDeLaDerecha*laMatrizDelNodoDeLaDerecha.length) /  (laMatrizDelNodoDeLaIzquierda.length + laMatrizDelNodoDeLaDerecha.length);
	return elGiniPonderado;
   }

}