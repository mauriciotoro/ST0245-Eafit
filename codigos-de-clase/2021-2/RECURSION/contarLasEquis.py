

def contarLasEquis(cadena, i):
    if i == len(cadena):
        return 0
    if cadena[i] == 'x':
        return contarLasEquis(cadena, i+1) + 1
    else:
        return contarLasEquis(cadena, i+1) + 0

print(contarLasEquis("hixix", 0))