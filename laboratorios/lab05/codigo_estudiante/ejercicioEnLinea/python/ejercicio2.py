import numpy as np
info = ["3","3","0 1","1 2","2 0","3","2","0 1","2 1","9","8","0 1", "0 2", "0 3", "0 4", "0 5", "0 6", "0 7", "0 8"] #Datos con instrucciones
listaInstrucciones = [] #Lista con diferentes paquetes de instrucciones

n = len(info)
listita = []
listita.append(info[0])
listita.append(info[1])

for i in range (2,n):
  if len(info[i])== 1 and len(info[i+1])==1:
    listaInstrucciones.append(listita)
    listita = []
    listita.append(info[i])
  
  else:
    listita.append(info[i])
listaInstrucciones.append(listita)
   
m = len(listaInstrucciones)

for j in range(0,m):
  ...
  if possible == True:
    print("BICOLORABLE")
  else:
    print("NOT BICOLORABLE")
