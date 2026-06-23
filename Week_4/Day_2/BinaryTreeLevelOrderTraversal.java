//Problem: https://leetcode.com/problems/binary-tree-level-order-traversal/
//Description: Given the root of a binary tree, return the level order traversal of its nodes' values (level by level from left to right).
//Approach: Use a queue for BFS, process nodes level by level, and store each level's values in a separate list.
//Time Complexity: O(n)

package Week_4.Day_2;
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            ans.add(level);
        }

        return ans;
    }
}