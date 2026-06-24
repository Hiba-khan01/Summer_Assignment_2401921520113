//Problem: https://leetcode.com/problems/search-in-a-binary-search-tree/
//Description: Given the root of a Binary Search Tree (BST) and a value, return the subtree rooted at the node with that value. If the value does not exist, return null.
//Approach: Compare the target value with the current node; move left if smaller, right if larger, until the value is found or the tree ends.
//Time Complexity: O(h)
package Week_4.Day_3;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val)
                return root;
            else if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }
        return null;
    }
}
