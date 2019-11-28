#!/usr/bin/env python
# coding: utf-8

# In[ ]:


class Node:
    def __init__(self, name, size, author):
        self.sons = []
        self.parent = None
        self.name = name
        self.size = size
        self.author = author
    
class Tree():
    def __init__(self):
        self.root = None
          
    def add_file(self, name, size, author, location, node = None):
        ...
    
    def search(self, name):
        ...
    
    def search_aux(self, name, actual):
        ...
                    
    def findFilesByFolderAndSize(self, desiredSize, smallestSubfolder):
        ...
    
    def findFilesByFolderAndAuthor(self, desiredAuthor, smallestSubfolder):
        ...
    
    def findInDirectory(self, smallestSubfolder):
        ...
            


