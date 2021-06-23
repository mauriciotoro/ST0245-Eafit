import numpy as np
class CircularQueue:
    def __init__(self, size): 
        self.queue = np.zeros(size)
        self.front = 0
        self.rear = 0
        self.size = size
        self.currentSize = 0
    
    def add(self, x):
        if self.currentSize == self.size: 
            raise Exception("The queue is full: front size: " + str(self.rear)) 
        self.queue[self.rear] = x
        self.rear += 1
        self.rear = (self.rear + 1) % self.size #....
        self.currentSize += 1
        return True
    
    def peek(self):
        if self.front == self.rear: 
            raise Exception("The queue is empty");
        return self.queue[self.front]
    
    def poll(self):
        if self.front > self.rear: 
            raise Exception("The queue is empty");
        self.currentSize -= 1
        self.front += 1
        return self.queue[self.front-1]
    
def __main__():
        q = CircularQueue(10)
        q.add(2)
        q.add(3)
        print(q.poll())

__main__()
