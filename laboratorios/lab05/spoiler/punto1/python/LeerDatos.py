import pandas as pd

dataVertices = pd.read_csv('Vertices.csv')
print(dataVertices.head())

dataArcos = pd.read_csv('Arcos.csv')
print(dataArcos.head())

diccArcos = {}
for i in ______:
    diccArcos[(dataArcos.iloc[i]['ID'],dataArcos.iloc[i]['ID1'])] = _________

print("El diccionario de los arcos es:")
print(diccArcos)

diccVert = {}
for i in ____:
    diccVert[(dataVertices.iloc[i]['ID'])] = _____

print("El diccionario de los vertices es:")
print(diccVert)

    
