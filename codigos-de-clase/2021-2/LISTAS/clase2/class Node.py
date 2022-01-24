class Node:
    def __init__(self, value):
        self.val = value
        self.next = None 
def printLista(head):
    temp = head
    while temp:
        print(temp.val, " -> ", end="")
    print()

def rotar_uno(head: Node):
    penultimo = head
    ultimo = head.next
    while  ultimo.next != None:
        penultimo = penultimo.next
        ultimo = ultimo.next
    
    # Ultimo a cabeza
    ultimo.next = head

    # Penultimo a ultimo
    penultimo.next = None



def rotar(head: Node, k: int):
    if head == None:
        return None
    
    # Sacar tamano
    temp = head
    counter = 0

    while temp != None:
        counter += 1
        temp = temp.next
    

    # Modulo K
    k %= counter

    for i in range(k):
        rotar_uno(head)
    
    return head


def main():
    head = Node(1)
    node2 = Node(2)
    node3 = Node(3)

    head.next = node2
    node2.next = node3

    
    printLista(rotar(head, 1))
    

main()