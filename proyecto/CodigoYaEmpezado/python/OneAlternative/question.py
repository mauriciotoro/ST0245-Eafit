"""
Module containing the Question class for a CART Decision tree implementation. 
"""

from utilities.utils import is_numeric

class Question:
    """ A Question is used to partition the dataset. """

    def __init__(self, column, value, headers):
        """ Store te column and value used to partition the data. E.g. (0, Green). """
        self.column = column
        self.value = value
        self.headers = headers

    def match(self, example):
        """ Compares the feature value in the given example to the feature value in this question. """
        val = example[self.column]
        if is_numeric(val):
            return val >= self.value
        else:
            return val == self.value

    def __repr__(self):
        """ To string method. """
        condition = "=="
        if is_numeric(self.value):
            condition = ">="
        return f"Is {self.headers[self.column]} {condition} {str(self.value)}"