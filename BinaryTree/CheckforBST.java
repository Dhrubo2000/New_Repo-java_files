package BinaryTree;
//import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class CheckforBST {

    int maxValue(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int val = root.data;
        int left = maxValue(root.left);
        int right = maxValue(root.right);

        return Math.max(val, Math.max(left,right));
    }

    int minValue(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int val = root.data;
        int left = minValue(root.left);
        int right = minValue(root.right);

        return Math.min(val, Math.min(left,right));
    }

    boolean isBST(Node root){
        if(root == null){
            return true;
        }
        //if the max value in the left subtree is greater than the root.data then return false
        if(root.left != null && maxValue(root.left) > root.data){
            return false;
        }
        //if the min value in the left subtree is lesser than the root.data then return false
        if(root.right != null && minValue(root.right) < root.data){
            return false;
        }
        //left subtree and right subtree must follow the rules of bst
        if(isBST(root.left)==false || isBST(root.right)==false){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        // root.right.left = new Node(7);

        CheckforBST bst = new CheckforBST();

        if(bst.isBST(root)){
            System.out.println("is a BST.....");
        }else{
            System.out.println("not a BST.....");
        }
    }
}
