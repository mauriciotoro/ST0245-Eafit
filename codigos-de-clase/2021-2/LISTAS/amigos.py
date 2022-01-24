class Persona:
    def __init__(self,color):
        self.__color__ = color
        self.__mejor__ = None
    def asignarAmigo(self,amigo):
        self.__mejor__ = amigo

def __main__():
    mauricio = Persona("negro")
    julian = Persona("azul")
    simon = Persona("verde")
    mauricio.__mejor__ = julian
    julian.__mejor__ = simon 
    simon.__mejor__ = mauricio
    print("el amigo de " + mauricio.__color__ + " es " + mauricio.__mejor__.__color__)

__main__()
