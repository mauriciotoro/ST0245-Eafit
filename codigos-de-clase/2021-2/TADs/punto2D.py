import math
class Punto2D:
    """Clase para representar un punto en 2D"""
    def __init__(self, x, y, nombre):
        """Construye un punto2D con un X y un Y"""
        self.__x = x
        self.__y = y
        self.__nombre = nombre
    def x(self):
        return self.__x
    def y(self):
        return self.__y
    def anguloConElEjeX(self):
        """Calcula el angulo con el eje X en radianes"""
        elAnguloConElEjeX = math.atan2(__y,__x) #atan(y/x)
        #arc tangent = atan, tangente inversa o arcotangente
        return elAnguloConElEjeX
    def distanciaAlOrigen(self):
        return 0
    def __str__(self):
        return "Punto2D("+str(self.__x)+","+str(self.__y)+")"
