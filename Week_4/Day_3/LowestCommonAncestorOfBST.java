//Problem: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//Description: Given a Binary Search Tree (BST) and two nodes p and q, find their lowest common ancestor (LCA).
//Approach: Use the BST property: if both nodes are smaller than the current node, go left; if both are greater, go right; otherwise, the current node is the LCA.
//Time Complexity: O(h)

package Week_4.Day_3;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val)
                root = root.left;
            else if (p.val > root.val && q.val > root.val)
                root = root.right;
            else
                return root;
        }
        return null;
    }
}