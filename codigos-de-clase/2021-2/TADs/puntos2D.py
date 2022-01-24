import urllib.request
from punto2D import Punto2D
import matplotlib.pyplot as plt

def bajar():
    urllib.request.urlretrieve("https://github.com/mauriciotoro/ST0245-Eafit/raw/master/talleres/taller01/datasets/puntos2D.csv", "puntos2D.csv")

def cargarArchivo():
    with open("puntos2D.csv","r") as archivo:
        texto = archivo.read()
    return texto

def crearPuntos():
    lineas = texto.split("\n")[1:]
    puntos = [0]*len(lineas)
    for i,linea in enumerate(lineas):
        campos = linea.split(",")
        x = float(campos[0])
        y = float(campos[1])
        nombre = campos[2]
        punto = Punto2D(x,y,nombre)
        puntos[i] = punto
    return puntos

def dibujarPuntos(puntos):
    X, Y = [0]*len(puntos), [0]*len(puntos)
    for i,punto in enumerate(puntos):
        X[i] = punto.x()
        Y[i] = punto.y()
    plt.scatter(X,Y)
    plt.show()

bajar()
texto = cargarArchivo()
#print(texto)
puntos = crearPuntos()
#print(puntos)
dibujarPuntos(puntos)