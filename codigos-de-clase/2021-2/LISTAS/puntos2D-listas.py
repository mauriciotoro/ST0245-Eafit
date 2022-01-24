import urllib.request
from punto2D import Punto2D
import time
from collections import deque

def bajar():
	urllib.request.urlretrieve("https://github.com/mauriciotoro/ST0245-Eafit/raw/master/talleres/taller01/datasets/MuchosPuntos2D.csv","MuchosPuntos2D.csv")

def cargarArchivoEnTexto():
	with open("MuchosPuntos2D.csv","r") as archivo:
	     texto = archivo.read()
	     return texto

def pasarArregloDinamico(texto):
	arregloDinamico = []
	lineas = texto.split("\n")
	for linea in lineas:
	    X,Y = map(float, linea.split(","))		
	    arregloDinamico.insert(0,Punto2D(X,Y))
	return arregloDinamico

def pasarAListasEnlazadas(texto):
	lista = deque()
	lineas = texto.split("\n")
	for linea in lineas:
	    X,Y = map(float, linea.split(","))		
	    lista.appendleft(Punto2D(X,Y))
	return lista

def pasarArreglo(texto):
	lineas = texto.split("\n")
	arreglo= [0]*len(lineas)
	i = len(lineas) - 1
	for linea in lineas:
	    X,Y = map(float, linea.split(","))		
	    arreglo[i] = Punto2D(X,Y)
	    i = i -1
	return arreglo



#bajar()
texto = cargarArchivoEnTexto()


tiempo_inicial = time.time()
lista = pasarAListasEnlazadas(texto)
print("tiempo con listas enlazadas " + str(time.time() - tiempo_inicial))

tiempo_inicial = time.time()
arreglo = pasarArreglo(texto)
print("tiempo con arreglos estáticos " + str(time.time() - tiempo_inicial))

tiempo_inicial = time.time()
arregloDinamico = pasarArregloDinamico(texto)
print("tiempo con arreglos dinamicos " + str(time.time() - tiempo_inicial))

