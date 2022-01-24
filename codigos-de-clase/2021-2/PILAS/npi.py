from collections import deque

ejemplo = ["3", "10", "5", "+", "*"]
ejemplo2 = "3 10 5 + *".split(" ")

def npi(ecuacion):
  pila = deque()
  return npiAux(ecuacion,0,pila)

def npiAux(ecuacion,i,pila):
  if i < len(ecuacion):
    if ecuacion[i] in "+-*/":
      elemento2 = pila.pop()
      elemento1 = pila.pop()
      resultado = str(eval(elemento2+ecuacion[i]+elemento1))
      pila.append(resultado)
    else: #es un numero 
      pila.append(ecuacion[i])
    npiAux(ecuacion,i+1,pila)
  return int(pila[-1])

def main():
  print(npi(ejemplo))

main()
