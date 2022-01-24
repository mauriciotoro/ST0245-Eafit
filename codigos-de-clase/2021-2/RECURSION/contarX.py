def calcularX2(caracteres, i):
    
    if(i == len(caracteres)):
        
        return 0;
    
    if(caracteres[i] == "x"):
        
        return 1 + calcularX2(caracteres, i+1)
    
    return  0 + calcularX2(caracteres, i+1)



def calcularX(caracteres, i, acum):
    
    if(i == len(caracteres)):
        
        return acum;
    
    if(caracteres[i] == "x"):
        
        return (calcularX(caracteres, i+1, acum+1))
    
    return (calcularX(caracteres, i+1, acum))
    

caracteres = input()
print(calcularX2(caracteres, 0))