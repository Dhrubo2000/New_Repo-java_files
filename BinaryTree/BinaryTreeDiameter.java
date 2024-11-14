package BinaryTree;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeDiameter {
    static int result;

    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Call the solve method and print the result
        int diameter = solve(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }

    public static int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        result = Math.max(result, left + right);

        return Math.max(left, right) + 1;
    }
}
