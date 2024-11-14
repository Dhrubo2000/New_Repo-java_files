package BinaryTree;


import java.util.*;
class Node {
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left=right=null;
    }
}

public class Levelorder {

    public void levelorder(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node temp = q.remove();
                System.out.print(temp.data + " ");

                if(temp.left != null){
                    q.add(temp.left);
                }

                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);

        Levelorder tree = new Levelorder();
        tree.levelorder(root);
    }
}
