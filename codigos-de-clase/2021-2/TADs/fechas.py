import urllib.request
import matplotlib.pyplot as plt

def bajar():
    urllib.request.urlretrieve("https://github.com/mauriciotoro/ST0245-Eafit/raw/master/talleres/taller01/datasets/fechas.csv","fechas.csv")

def cargarArchivo():
    with open("fechas.csv","r", encoding = "latin-1") as archivo:
        texto = archivo.read()
    return texto

def crearFechas(texto):
    fechas = []
    lineas = texto.split("\n")
    for linea in lineas[1:]:
        if linea != "":
            fechaYHoraEnString = linea.split(",")[0]
            fechaEnString = fechaYHoraEnString.split(" ")[0]
            fechaDividida = fechaEnString.split("/")
            dia = int(fechaDividida[0])
            mes = int(fechaDividida[1])
            anho = int(fechaDividida[2])
        
            fechas += [fechaEnString]
    return fechas


bajar()
texto = cargarArchivo()
fechas = crearFechas(texto)

plt.plot_date(fechas, range(0,len(fechas)))
plt.show()