//Problem: https://leetcode.com/problems/binary-tree-inorder-traversal/
//Description: Given the root of a binary tree, return the inorder traversal of its nodes' values.
//Approach: Traverse the left subtree, visit the root, then traverse the right subtree (Left → Root → Right).
//Time Complexity: O(n)
package Week_4.Day_2;
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}