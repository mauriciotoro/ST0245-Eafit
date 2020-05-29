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
        if actual.data == ____:
            return 

        if data > ____:
            if actual.right is None:
                actual.right = ____
            else:
                self.__insertar_aux(____, _____)
        else:
            if actual.left is None:
                actual.left = ____
            else:
                self.__insertar_aux(____, ______)

    # ------------------------------------------------------    
    def buscar(self, data):
        return self.__buscar_aux(data, self.root)

    def __buscar_aux(self, data, actual):
        if actual is None:
            return _____
        
        if actual.data == ____:
            return _____
        
        if data > ______:
            return self.__buscar_aux(data, _____)
        else:
            return self.__buscar_aux(data, _____)
            
    # -----------------------------------------------
    def borrar(self, data):
        self.__borrar_aux(data, self.root)

    def __borrar_aux(self, data, actual):
        if actual is None:
            return
        
        if data > actual.data:
            actual.right = self.__borrar_aux(data, ____)
        elif data < actual.data:
            actual.left = self.__borrar_aux(data, ____)
        else:
            if actual.left is None:
                temp = ____
                return temp
            elif actual.right is None:
                temp = ____
                return temp
            else:
                temp = self.__minValueNode(____)
                actual.data = temp.data
                actual.right = self.__borrar_aux(temp.data, ___)

        return actual

    def __minValueNode(self, actual):
        temp = actual
        while(temp.left is not None):
            temp = temp.left 
    
        return temp
        

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
        if actual is None:
            return 
        else:
            if actual.left is not None and actual.right is not None:
                return f'{actual} -> {actual.left} \n {actual} -> {actual.right}'
            if actual.left is not None:
                return f'{actual} -> {actual.left}'
            if actual.right is not None:
                return f'{actual} -> {actual.right}'


if __name__ == '__main__':
    b = BinaryTree()
    b.insertar(4)
    b.insertar(3)
    b.insertar(5)
    #b.imprimir()
    #b.borrar(3)
    print(b.buscar(3))
    b.imprimir()
    print(b.dibujar())

