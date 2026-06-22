//Problem: https://leetcode.com/problems/same-tree/
// Description: Check if two binary trees are identical.
// Approach: first we Compare current nodes and recursively check subtrees.
// Time Complexity: O(n)

package Week_4.Day_1;
import java.util.*;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}