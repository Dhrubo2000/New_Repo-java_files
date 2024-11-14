package BinaryTree;


public class BinarySearchTree {
    public class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public BinarySearchTree(){}

    public Node insertion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertion(root.left, data);
        } else {
            root.right = insertion(root.right, data);
        }
        return root;
    }

    void insert(int data) {
        root = insertion(root, data);
    }

    void inordertraversal(Node root) {
        if (root == null) {
            return;
        }

        inordertraversal(root.left);
        System.out.println(root.data + " ");
        inordertraversal(root.right);
    }

    void inorder() {
        inordertraversal(root);
    }


    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(6);
        tree.insert(5);
        tree.insert(3);
        tree.insert(4);

        tree.inorder();
    }
}
