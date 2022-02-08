with open("calles_de_medellin_con_acoso.csv") as archivo:
   cadenaDeCaracteres = archivo.read( )

print(cadenaDeCaracteres)


with open("calles_de_medellin_con_acoso.csv") as archivo:
   listaDeLineasDondeCadaLineaEsUnaCadena = archivo.readlines( )

print (listaDeLineasDondeCadaLineaEsUnaCadena)

