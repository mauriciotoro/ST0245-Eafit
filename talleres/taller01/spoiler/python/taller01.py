#!/usr/bin/python
import math

class Counter():
    """counter."""
    def __init__(self):
        self.__x = 0

    def increase(self):
        self.x = self.x + 1

    def increments(self):
        return self.x

    def toString(self):
        print str(self.x)

class Punto2D():
    """Representacion de punto en 2 dimenciones"""

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return x

    def get_y(self):
        return y

    def radio_polar(self):
        return math.____((__ * __) + (__ * __)

    def angulo_polar(self):
        return math.____(x / y)

    def dist_euclidiana(self, other):
        dx = self.x - other.get_x()
        dy = self.y - other.get_y()
        return math.____((__ * __) + (__ * __))
