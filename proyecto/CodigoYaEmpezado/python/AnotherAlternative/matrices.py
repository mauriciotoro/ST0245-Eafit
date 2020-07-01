import numpy as np
def dividirUnaMatrizEnDosMatrices(m, posVariable, valor)
	enCuantosEstudiantesLaVariableEsIgualAlValor = 0
	for fila in range( 0, np.size(m,0) ):
		if m[fila][posVariable] == valor # por ejemplo, valor es 3, 10 SMLVM, Masculino
			enCuantosEstudiantesLaVariableEsIgualAlValor++
	enCuantosEstudiantesLaVariableNOEsIgualAlValor = np.size(m,0) - enCuantosEstudiantesLaVariableEsIgualAlValor
	matrizLaVariableEsIgualAlValor = np.zeros(enCuantosEstudiantesLaVariableEsIgualAlValor,np.size(m,0))
	matrizLaVariableNOEsIgualAlValor = np.zeros(enCuantosEstudiantesLaVariableNOEsIgualAlValor,np.size(m,0))
	# Copiar los datos a las matrices
	# ...
	parejaDeMatrices = (matrizLaVariableEsIgualAlValor,matrizLaVariableNOEsIgualAlValor)
	return parejaDeMatrices
