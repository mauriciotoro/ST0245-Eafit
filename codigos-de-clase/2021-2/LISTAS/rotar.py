class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

def rotar(head: Node,k):
    count = 0
    current=head
    while(current is not None):
        current=current.next
        count+=1
    if(count==0):
        return head
    k=k%count
    if(k==0):
        return head
    
    slow=head
    fast=head

    while k>0:
        fast=fast.next
        k-=1
    while fast.next!=None:
        fast=fast.next
        slow=slow.next

    fast.next=head
    newhead=slow.next
    slow.next=None
    return newhead

def main():
   nodo1 = Node(1)
   nodo2 = Node(2)
   nodo3 = Node(3)
   nodo1.next = nodo2
   nodo2.next = nodo3
   resp = rotar(nodo1, 2)

