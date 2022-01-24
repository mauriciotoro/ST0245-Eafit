class Persona:
    def __init__(self, color):
        self.__color__ = color
        self.__mejor__ = None
    def asignarMejor(self, amigo):
        self.__mejor__ = amigo

def __main__():
    negro = Persona("negro")
    azul = Persona("azul")
    verde = Persona("verde")
    negro.asignarMejor(azul)
    azul.asignarMejor(verde)
    verde.asignarMejor(negro)
    print("me llamo " + negro.__color__ + "y mi amigo es " + negro.__mejor__.__color__)    

__main__()