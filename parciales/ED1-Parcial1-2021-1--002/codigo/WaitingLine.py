import numpy as np
class WaitingLine:

  def __init__(self, n):
    self.e = np.zeros(n)
    self.index = 0;
    self.started = False;

  def isEmpty(self): 
    return (self.index == 0 and not self.started) or self.index <= 0

  def enqueue(self,x):
    if self.index == self.e.size:
      raise Exception("Full")
    self.started = True
    self.e[self.index] = x
    self.index = self.index + 1

  def dequeue(self):
    if self.isEmpty():
      raise Exception("Empty")
    x = self.e[0]
    for i in range (0, self.index - 1):
      self.e[i] = self.e[i + 1]
    self.index = self.index - 1
    return x

def __main__():
    w = WaitingLine(5)
    w.enqueue(2)
    w.enqueue(3) 
    print(w.dequeue())
    print(w.dequeue())
    print(w.dequeue())

__main__()
