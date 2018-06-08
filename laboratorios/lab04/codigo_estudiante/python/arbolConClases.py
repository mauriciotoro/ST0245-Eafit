class Nodo:
	def __init__(self, nombre):
		self.left = None
		self.right = None
		self.nombre = nombre 

	def __repr__(self):
		return f'{self.nombre}'

class ArbolGenealogico:
    def __init__(self, nombre): # El arbol se crea con el nombre del 'dueno' como raiz
        self.root = Nodo(nombre)

    # Punto 1.1 y 1.2
    # Para anadir un pariente busco el nombre del que quiero anadir
    def add_familiar(self, nombre, mama = None, papa = None):
    
    # Punto 1.3
    # Buscar
    def buscar(self, data):
     

    def __buscar_aux(self, data, actual):
      

    # Tamano? Numero de Nodos??
    def size(self):
        return self.__size_aux(self.root)

    def __size_aux(self, nActual):
        if nActual is None or nActual.nombre == None:
            return 0
        else:
            return self.__size_aux(nActual.left) + self.__size_aux(nActual.right) + 1

    # Altura
    def altura(self):
        return self.__altura_aux(0, self.root)

    def __altura_aux(self, alt, nActual):
        if nActual is None:
            return 0
        else:
            a = self.__altura_aux(alt, nActual.left) + 1
            b = self.__altura_aux(alt, nActual.right) + 1
            return max(a, b)

    # InOrder
    def imprimir(self):
        self.__imprimir_aux(self.root)
        
    def __imprimir_aux(self, actual):
        if actual is not None:
            self.__imprimir_aux(actual.left)
            print(actual)
            self.__imprimir_aux(actual.right)

    # Punto 1.4
    def abuela_materna(self):


if __name__ == '__main__':
    ag = ArbolGenealogico('Camilo')
    ag.add_familiar('Camilo', 'Gloria', 'Jose')
    ag.add_familiar('Gloria', 'Aurora')
    ag.add_familiar('Jose', papa = 'Bernardo')
    print(ag.buscar('Jose'))
    print(ag.buscar('???'))
    print()
    ag.imprimir()
    print()
    print(ag.abuela_materna())
    print(ag.altura())
    print(ag.size())
