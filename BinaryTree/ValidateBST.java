package BinaryTree;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class ValidateBST {

    public boolean isBST(Node root){
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkBST(Node root, long min, long max){
        if(root == null){
            return true;
        }

        if(root.data >= max || root.data <= min){
            return false;
        } 

        return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
    }
    public static void main(String args[]){
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(5);
        root.right.right = new Node(6);

        ValidateBST bst = new ValidateBST();
        System.out.println(bst.isBST(root));
    }
}
