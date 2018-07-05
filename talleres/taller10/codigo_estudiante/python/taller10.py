class Nodo:
	def __init__(self, data):
		self.left = None
		self.right = None
		self.data = data

	def __repr__(self):
		return f'{self.data}'

class BinaryTree:
    def __init__(self):
        self.root = None
    
    # ------------------------------------------------------
    def insertar(self, data):
        if self.root is None:
            self.root = Nodo(data)
        else:
            self.__insertar_aux(data, self.root)

    def __insertar_aux(self, data, actual):
       

    # ------------------------------------------------------    
    def buscar(self, data):
        return self.__buscar_aux(data, self.root)

    def __buscar_aux(self, data, actual):
       
            
    # ------------------------------------------------------

    def borrar(self, data):
        self.__borrar_aux(data, self.root)

    def __borrar_aux(self, data, actual):
      
    

    # ------------------------------------------------------
    # In-Orden        
    def imprimir(self):
        self.__imprimir_aux(self.root)
        
    def __imprimir_aux(self, actual):
        if actual is not None:
            self.__imprimir_aux(actual.left)
            print(actual.data)
            self.__imprimir_aux(actual.right)
            
    # ------------------------------------------------------
    def dibujar(self):
        return  f'digraph G {"{"} \n {self.__dibujar_aux(self.root)} \n{"}"}'
    
    def __dibujar_aux(self, actual):
       


if __name__ == '__main__':
    b = BinaryTree()
    b.insertar(4)
    b.insertar(3)
    b.insertar(5)
    print(b.buscar(3))
    b.imprimir()
    print(b.dibujar())

