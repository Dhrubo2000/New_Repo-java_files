package BinaryTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Ceil_in_BST {

    int findceil(Node root, int x) {
        if(root == null) return Integer.MIN_VALUE;

        if(root.data == x) return root.data;

        if(root.data < x) {
            int ceilVal = findceil(root.right, x);
        }

        int ceilVal = findceil(root.left, x);

        return (ceilVal >= x) ? ceilVal : root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(30);

        Ceil_in_BST c = new Ceil_in_BST();
        System.out.println(c.findceil(root, 12));
    }
}
