"""
Module containing the necessary classes and functions to build a CART Decision Tree.
"""

from utilities.utils import class_counts
from utilities.math import find_best_split, partition

class Leaf:
    """
    A leaf node classifies data.

    It holds a dictionary of class -> number of times it appears in the rows 
    from the training data that reached the leaf.
    """


class DecisionNode:
    """
    A decision node asks a question.

    It holds a reference to a question and to the two child nodes.
    """
 

def build_tree(rows, headers):
    """
    Builds the tree following this rules:
    1. Believe that it works.
    2. Start by checking for the base case (no further info gain).
    3. Prepare for giant stack traces.
    """
   

def classify(row, node):
    """ Classify a given input on a given tree. """
  

def print_tree(node, spacing=""):
    """ Print the tree to the standard output. """
    # base case: we've reached a leaf.
    if isinstance(node, Leaf):
        print(spacing + "Predict", node.predictions)
        return
    # print the question at the current node
    print(spacing + str(node.question))
    # call this function recursively on the true and false branches
    print(spacing + "--> True:")
    print_tree(node.true_branch, spacing + "  ")
    print(spacing + "--> False:")
    print_tree(node.false_branch, spacing + "  ")

def print_leaf(counts):
    """ A nicer way to print the predictions at a leaf. """
    total = sum(counts.values()) * 1.0
    probs = {}
    for lbl in counts.keys():
        probs[lbl] = str(int(counts[lbl] / total * 100)) + '%'
    return probs
