//Problem: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
//Description: Given the root of a binary tree, return the zigzag level order traversal of its nodes' values (alternate between left-to-right and right-to-left for each level).
//Approach: Use BFS with a queue, and reverse the insertion order at alternate levels using a flag.
//Time Complexity: O(n)

package Week_4.Day_2;
import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (leftToRight)
                    level.addLast(node.val);
                else
                    level.addFirst(node.val);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            ans.add(level);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}