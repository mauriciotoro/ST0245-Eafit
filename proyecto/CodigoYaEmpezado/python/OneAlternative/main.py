"""
Module containing the actual Decision Tree for the topic of the project.
"""

from utilities.utils import read_dataset
from decision_tree import build_tree, classify, print_tree, print_leaf

def main():
    headers, data_set = read_dataset("../csv_data/data_set.csv")
    my_tree = build_tree(data_set, headers)
    #print_tree(my_tree)
    print(print_leaf(classify([6.44,21.0,65.22,1431.0,19.0,99.0], my_tree)))

if __name__ == "__main__":
    main()