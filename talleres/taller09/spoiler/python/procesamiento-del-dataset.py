import requests

# Descargar del archivo CSV de internet
uniform_resource_locator_del_archivo_CSV = "https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/talleres/taller09/datasets/usda-dc-directory.csv"
peticion = requests.get(uniform_resource_locator_del_archivo_CSV)
contenido_del_archivo = peticion.content

# Guardar el archivo CSV bajado de internet
archivoCSV = open('archivoDescargado.csv', 'wb')
archivoCSV.write(contenido_del_archivo)
archivoCSV.close()

# Cargar el archivo CSV desde el computador 
archivoCSV = open('archivoDescargado.csv', 'r')
texto_del_archivoCSV = archivoCSV.read()
archivoCSV.close()

# Dividir un archivo CSV en líneas
lineas_del_texto_del_archivoCSV = texto_del_archivoCSV.split("\n")[1:]

# Generar una tabla de hash con el contenido dividido en lineas
tabla_de_hash = dict()
for linea in lineas_del_texto_del_archivoCSV:
	columnas = linea.split(",")
	nombre_y_apellido = columnas[1]+" "+columnas[0]
	telefono = columnas[3]
	tabla_de_hash[nombre_y_apellido] = telefono

# Guardar una tabla de hash en un archivo
archivo = open('diccionario.txt', 'w')
archivo.write(str(tabla_de_hash))
archivo.close()

# Cargar una tabla de hash desde un archivo
archivo = open('diccionario.txt','r')
contenido_de_diccionario = archivo.read()
archivo.close()
tabla_de_hash = eval(contenido_de_diccionario)

# Imprimir una tabla de hash
for nombre_y_apellido in tabla_de_hash.keys():
	print (nombre_y_apellido, tabla_de_hash[nombre_y_apellido])
