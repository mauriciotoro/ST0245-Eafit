import urllib.request
from zipfile import ZipFile
import matplotlib.pyplot as plt

def bajar():
	urllib.request.urlretrieve("https://github.com/mauriciotoro/ST0245-Eafit/raw/master/talleres/taller01/datasets/puntos2D.zip","puntos2D.zip")

def descomprimir():
	comprimido = ZipFile("puntos2D.zip","r")
	comprimido.extractall("./")

# main

with open("medellin_colombia-grande.txt", "r",  encoding="latin-1") as archivo:
	texto = archivo.read()

print(len(texto))
puntos = texto.split("Arcos")[0]
print(len(puntos))

lineas = puntos.split("\n")
print(lineas[0])
print(lineas[1])
print(lineas[-1])
print(lineas[-2])
print(lineas[-3])

lineas = lineas[1:-3]
print(lineas[0])
print(lineas[-1])

elementos = len(lineas)

puntos, Y, X = [0]*elementos, [0]*elementos, [0]*elementos


i = 0
for linea in lineas:
	division = linea.split(" ")	
	Y[i] = float(division[1])
	X[i] = float(division[2])
	i = i+1

#plt.scatter(X,Y)
#plt.show()

with open("MuchosPuntos2D.csv",'w') as archivo:
	for i in range(elementos):
		archivo.write(str(X[i])+","+str(Y[i])+"\n")

print(elementos)
