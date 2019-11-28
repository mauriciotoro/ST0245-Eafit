import pandas as pd

dataVertices = pd.read_csv('Vertices.csv')
dataVertices.columns = ["ID","CoordenadaX","CoordenadaY","Nombre"]
print(dataVertices.head())

dataArcos = pd.read_csv('Arcos.csv')
dataArcos.columns = ["ID","ID1","Distancia","Nombre"]
print(dataArcos.head())

...
    
