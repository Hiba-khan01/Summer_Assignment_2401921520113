//Problem: https://leetcode.com/problems/diameter-of-binary-tree/
// Description: Find the diameter of a binary tree.
// Approach: compute height recursively and update maximum diameter.
// Time Complexity: O(n)

package Week_4.Day_4;

class Solution {
    int d = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ht(root);
        return d;
    }

    private int ht(TreeNode node) {
        if (node == null) return 0;

        int l = ht(node.left);
        int r = ht(node.right);

        d = Math.max(d, l + r);

        return Math.max(l, r) + 1;
    }
}