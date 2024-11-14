package BinaryTree;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    int preorderIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = inorder.length;

        for(int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }

        return construct(preorder, map, 0, len-1);
    }

    TreeNode construct(int[] preorder, HashMap<Integer, Integer> map, int left, int right) {
        if(left > right) {
            return null;
        }

        int pval = preorder[preorderIdx];
        int inorderIdx = map.get(pval);

        TreeNode root = new TreeNode(pval);
        preorderIdx++;

        root.left = construct(preorder, map, left, inorderIdx-1);
        root.right = construct(preorder, map, inorderIdx+1, right);

        return root;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode result = solution.buildTree(preorder, inorder);

        // Printing inorder traversal of the constructed tree
        printInorder(result);
    }

    // Utility function to print inorder traversal of a binary tree
    static void printInorder(TreeNode node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}
