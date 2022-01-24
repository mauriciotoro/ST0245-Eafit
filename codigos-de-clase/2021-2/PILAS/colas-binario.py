from collections import deque
def binarios(n):
	lista_res = deque()
	cola_q = deque()
	cola_q.appendleft("1")
	for i in range(0,n):
		cola_q.appendleft(cola_q[-1]+"0")
		cola_q.appendleft(cola_q[-1]+"1")
		lista_res.append(cola_q.pop())
	return lista_res

print(binarios(7))
