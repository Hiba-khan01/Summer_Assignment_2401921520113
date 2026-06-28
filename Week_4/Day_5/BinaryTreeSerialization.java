//Problem: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
//Description: Design an algorithm to serialize and deserialize a binary tree.
//Approach: Serialization – Traverse the tree in preorder (root → left → right). Append node values to a StringBuilder, using "null" for missing children.
//Deserialization – Split the serialized string by commas and recursively rebuild the tree, creating nodes or returning null when "null" is encountered
//Time Complexity: O(n)
package Week_4.Day_5;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {

    // Serialize the tree into a string
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,"); // Marker for null nodes
            return;
        }
        sb.append(node.val).append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Deserialize the string back into a tree
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(values));
        return deserializeHelper(queue);
    }

    private TreeNode deserializeHelper(Queue<String> queue) {
        if (queue.isEmpty()) return null;

        String val = queue.poll();
        if (val.equals("null") || val.isEmpty()) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        return node;
    }

    // Utility method to print tree in preorder
    public void printPreorder(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        BinaryTreeSerialization codec = new BinaryTreeSerialization();

        // Create a sample tree:
        //       1
        //      / \
        //     2   3
        //        / \
        //       4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Serialize
        String serialized = codec.serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        // Deserialize
        TreeNode deserializedRoot = codec.deserialize(serialized);
        System.out.print("Preorder of Deserialized Tree: ");
        codec.printPreorder(deserializedRoot);
    }
}
