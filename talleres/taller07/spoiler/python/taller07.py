#!/usr/bin/python

class Nodo():
    def __init__(self, obj=None, nxt = None):
        self.obj = obj
        self.nxt = nxt

    def __str__(self):
        return "" + self.obj

class Lsimple():
    def __init__(self):
        self.first_Node = None
        self.last_Node = None

    def get(self, index):
        ______

    def insert(self, element):
        if self.__void() == True:
            self.first_Node = self.last_Node = ____
        else:
            aux = self.last_Node
            self.last_Node = aux.nxt = ____

    def size(self):
        ____

    def remove(self):
        aux = self.first_Node
        while aux.nxt =! self.last_Node:
            aux = aux.nxt
        aux.nxt = None
        self.last_Node = aux

    def contains(self):
        aux = self.fisrt_Node
        while aux != None:
            aux = aux.nxt
	    _____

    def insert(self, element, index):
 	_____

    def remove(self, index):
	_____
