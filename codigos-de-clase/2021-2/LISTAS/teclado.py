def insertarAlInicio(cabeza, dato):
	nodoQueTieneELDato = Nodo(dato)
	nodoQueTieneELDato.next = cabeza
	return nodoQueTieneELDato

# Usuario, si la cola es None, no me llames
def insertarAlFinal(cola, dato):
	nodoQueTieneELDato = Nodo(dato)
	cola.next = nodoQueTieneELDato
	return nodoQueTieneELDato

# Usuario, si el último que inserté None, no me llames
def insertarDespuesDelUltimoQueInserte(elUltimoQueInserte,dato):
	nodoQueTieneELDato = Nodo(dato)
	nodoQueTieneELDato.next = elUltimoQueInserte.next
	elUltimoQueInserte.next = nodoQueTieneELDato

def tecladoRoto(s:str):
	cabeza = None
	cola = None
	elUltimoQueInserte = None
	for caracter in s:
		if car == "[":
			elUltimoQueInserte = cabeza
		elif car == "]"
			elUltimoQueInserte = cola
		else: #sino es una letra, num, sim
			if elUltimoQueInserte != None:
				elUltimoQueInserteNuevo = insertarDespuesDelUltimoQueInserte(elUltimoQueInserte,car)
				if cola == elUltimoQueInserte:
					cola = elUltimoQueInserteNuevo
				elUltimoQueInserte = elUltimoQueInserteNuevo
			else: # el ultimoQueINserte Es None
				# sea que es lista vacía o hay lista pero voy a insertar al principio
				cabezaNueva = insertarAlInicio(cabeza,car)
				if cabeza == None:
					cola = cabezaNueva	
			    elUltimoQueInserte = cabezaNueva
				cabeza = cabezaNueva
	return cabeza