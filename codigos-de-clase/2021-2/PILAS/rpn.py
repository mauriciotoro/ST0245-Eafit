def npi(ecuacion):
   #pila = [] #quiero perder mi entrevista 
   pila = deque() # quiero el trabajo...
   return npiAux(ecuacion,0,pila)

def npiAux(ecuacion,i,pila):
  if ecuacion[i] in ["+","-","*","/"]: #es un operador
     elemento1 = pila.pop()
     elemento2 = pila.pop()
     respuesta = str(eval(elemento1+ecuacion[i]+elemento2))
     pila.append(respuesta)
  else: # es un numero
     pila.append(ecuacion[i])
