import pandas as pd 

Fundamentos = pd.read_csv('Fundamentos.csv')
Datos1 = pd.read_csv('Datos1.csv')
Datos2 = pd.read_csv('Datos2.csv')

Fundamentos = Fundamentos[["nombre", "código", "Cod. Materia", "Semestre","Nota Definitiva"]]
Datos1 = Datos1[["nombre", "código", "Cod. Materia", "Semestre", "Nota Definitiva"]]
Datos2 = Datos2[["nombre", "código", "Cod. Materia", "Semestre", "Nota Definitiva"]]


Fundamentos = Fundamentos.drop_duplicates(['código'],keep = 'last')
Datos1 = Datos1.drop_duplicates(['código'], keep = 'last')
Datos2 = Datos2.drop_duplicates(['código'], keep = 'last')

print (Fundamentos)
print (Datos1)
print (Datos2)

def BuscarCurso(materia, Semestre):
    _____

def BuscarAlumno(Estudiante, Semestre):
    _____