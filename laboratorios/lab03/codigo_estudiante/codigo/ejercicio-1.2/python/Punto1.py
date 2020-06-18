import pandas as pd

Fund    = pd.read_csv("NOTAS ST0242.csv")
Estruc1 = pd.read_csv("NOTAS ST0245.csv")
Estruc  = pd.read_csv("NOTAS ST0247.csv")

def buscarAlumno(nombre):
    ...

def buscarGrupo(codigo, semestre):
    ...

buscarAlumno("Columbano")
buscarGrupo("ST0247", 20142)
