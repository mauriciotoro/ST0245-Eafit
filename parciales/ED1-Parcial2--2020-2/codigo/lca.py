# Python program to find LCA of n1 and n2 using one 
# traversal of Binary tree 
  
# A binary tree node 
class Node: 
      
    # Constructor to create a new tree node 
    def __init__(self, key): 
        self.key = key  
        self.left = None
        self.right = None
      
# This function returns pointer to LCA of two given 
# values n1 and n2 
# This function assumes that n1 and n2 are present in 
# Binary Tree 
def findLCA(root, n1, n2): 
      
    # Base Case 
    if root is None: 
        return None
  
    # If either n1 or n2 matches with root's key, report 
    #  the presence by returning root (Note that if a key is 
    #  ancestor of other, then the ancestor key becomes LCA 
    if root.key == n1 or root.key == n2: 
        return root  
  
    # Look for keys in left and right subtrees 
    left_lca = findLCA(root.left, n1, n2)  
    right_lca = findLCA(root.right, n1, n2) 
  
    # If both of the above calls return Non-NULL, then one key 
    # is present in once subtree and other is present in other, 
    # So this node is the LCA 
    if left_lca and right_lca: 
        return root  
  
    # Otherwise check if left subtree or right subtree is LCA 
    return left_lca if left_lca is not None else right_lca 
  
  
# Driver program to test above function 
  
# Let us create a binary tree given in the above example 
root = Node(1) 
root.left = Node(2) 
root.right = Node(3) 
root.left.left = Node(4) 
root.left.right = Node(5) 
root.right.left = Node(6) 
root.right.right = Node(7) 
print "LCA(4,5) = ", findLCA(root, 4, 5).key 
print "LCA(4,6) = ", findLCA(root, 4, 6).key 
print "LCA(3,4) = ", findLCA(root, 3, 4).key 
print "LCA(2,4) = ", findLCA(root, 2, 4).key 
