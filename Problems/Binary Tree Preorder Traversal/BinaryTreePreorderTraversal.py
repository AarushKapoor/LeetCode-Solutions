# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """

        if not root:
            return []
        
        stack = [root]
        output = []

        while stack:
            value = stack.pop()
            output.append(value.val)

            if value.right:
                stack.append(value.right)
            if value.left:
                stack.append(value.left)

        return output
