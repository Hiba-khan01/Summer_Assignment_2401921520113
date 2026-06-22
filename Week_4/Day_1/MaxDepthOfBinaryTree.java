//Problem: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Description: Find the maximum depth of a binary tree.
// Approach: for this, we use recursion to calculate depth of left and right subtrees.
// Time Complexity: O(n)

package Week_4.Day_1;
import java.util.*;

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int ans = Math.max(left, right) + 1;

        return ans;
    }
}