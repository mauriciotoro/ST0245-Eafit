class Nodo:
	def __init__(variable,valor):
		self.variable = variable
		self.valor = valor
		self.si = null
		self.no = null
	
variable, valor = Calcular_Mejor_variable(train)
matrizSi, matrizNo = Dividir_Matriz_En_dos( (variable, valor)  )
raiz = Nodo(variable, valor)
variableSi, valorSi = Calcular_Mejor_variable(matrizSi)
si = Nodo(variableSi, valorSi)
variableNo, valorNo = Calcular_Mejor_variable(matrizNo)
no = Nodo(variableNo, valorNo)
raiz.si = si
raiz.no = no

matrizSiSi, matrizSiNo = Dividir_Matriz_En_dos( (variableSi, valorSi)  )
variableSiSi, valorSiSi = Calcular_Mejor_Variable(matrizSiSi)
sisi = Nodo(variableSiSi, valorSiSi)
variableSiNo, valorSiNo = Calcular_Mejor_Variable(matrizSiNo)
sino = Nodo(variableSiNo, valorSiNo)
raiz.si.si = sisi
raiz.si.no = sino

class Arbol:
	def __init__(variable, valor):
		self.raiz = Nodo(variable, valor)
	def dibujar():
		return "digraph G { \n"  + \
		__dibujar__(self.raiz) + \
		"}"
	def __dibujar__(nodo):
		if (nodo.si == None and nodo.no = None):
			return ""
		else:
		    return " \" " + nodo.variable + " == " + nodo.valor + " -> "  + nodo.si.variable + " == " + nodo.si.valor + " \" " + "\n" + \
" \" " + nodo.variable + " == " + nodo.valor + " -> "  + nodo.no.variable + " == " + nodo.no.valor + " \" " + "\n" + \
__dibujar__(nodo.si) + __dibujar__(nodo.no) 

class Nodo:
	def __init__(matriz, nivelMax, nivel = 0):
		if (nivel == nivelMax):
			return None
		else:
			self.matriz = matriz
			self.variable, self.valor = Calcular_Mejor_variable(matriz)
			matrizSi, matrizNo = Dividir_Matriz_En_dos( (self.variable, self.valor)  )
			self.si = Nodo(matrizSi, nivelMax, nivel+1)
			self.no = Nodo(matrizNo, nivelMax, nivel+1)

	
#http://www.webgraphviz.com/
digraph G {
	graph [	fontname = "Helvetica-Oblique",
		fontsize = 36,
		label = "\n\n\n\nObject Oriented Graphs\nStephen North, 3/19/93",
		size = "12,12" ];
	node [	shape = polygon,
		sides = 4,
		distortion = "0.0",
		orientation = "0.0",
		skew = "0.0",
		color = cyan,
		style = filled,
		fontname = "Helvetica-Outline" ];
  "ingles == A1" -> "Ingles == A"
  "ingles == A1" -> "Ciudad = Bogotá"
  "Ingles == A" -> "matematicas = 80"
  "Ingles == A" -> "numlibros == 100 o mas libros"
}

