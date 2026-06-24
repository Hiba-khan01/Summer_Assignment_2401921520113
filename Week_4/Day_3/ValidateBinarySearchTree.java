//Problem: https://leetcode.com/problems/validate-binary-search-tree/
//Description: Given the root of a binary tree, determine if it is a valid Binary Search Tree (BST).
//Approach: Recursively check whether each node's value lies within a valid range (min, max) and update the range while traversing left and right subtrees.
//Time Complexity: O(n)

package Week_4.Day_3;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max)
            return false;

        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
}
