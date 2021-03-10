# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: TreeNode) -> List[int]:
        sol = []
        if root:
            sol = self.postorderTraversal(root.left)
            sol += self.postorderTraversal(root.right)
            sol.append(root.val)
        return sol