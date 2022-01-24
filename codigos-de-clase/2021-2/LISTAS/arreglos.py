import urllib.request
import time
from collections import deque

def bajar():
    url = "https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/talleres/taller01/datasets/MuchosPuntos2D.csv"
    urllib.request.urlretrieve(url,"losPuntos.csv")

def leerArchivoComoCadena():
    with open("losPuntos.csv","r") as archivo:
        texto = archivo.read()
        return texto
def pasarAVectorDinamico(texto):
    vectorDinamico = [] 
    lineas = texto.split("\n")
    for linea in lineas:
        if linea != "":
            x, y = map(float, linea.split(","))
            vectorDinamico.insert(0,(x,y))
    return vectorDinamico

def pasarAVectorEstatico(texto):
    lineas = texto.split("\n")
    vectorEstatico = [0]*len(lineas)
    for i, linea in enumerate(lineas):
        if linea != "":
            x, y = map(float, linea.split(","))
            vectorEstatico[i] = (x,y)
    return vectorEstatico

def pasarAListaEnlazada(texto):
    lineas = texto.split("\n")
    lista = deque()
    for linea in lineas:
        if linea != "":
            x,y = map(float, linea.split(","))
            lista.insert(0,(x,y))
    return lista

def __main__():
    bajar()
    texto = leerArchivoComoCadena()
    #print(texto[0:100])
    #tiempoDesde1970 = time.time()
    #vectorDinamico = pasarAVectorDinamico(texto)
    #tiempoOtraVezDesde1970 = time.time()
    #print(tiempoOtraVezDesde1970-tiempoDesde1970)
    tiempoDesde1970 = time.time()
    vectorEstatico = pasarAVectorEstatico(texto)
    tiempoOtraVezDesde1970 = time.time()
    print(tiempoOtraVezDesde1970-tiempoDesde1970)
    tiempoDesde1970 = time.time()
    lista = pasarAListaEnlazada(texto)
    tiempoOtraVezDesde1970 = time.time()
    print(tiempoOtraVezDesde1970-tiempoDesde1970)

__main__()