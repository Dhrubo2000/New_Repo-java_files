package BinaryTree;
import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class BoundaryTraversal {

    //checking if there is a leaf Node 
    boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }

    //adding the left boundary
    void addLeft(Node root, List<Integer> res){
        Node cur = root.left;
        while(cur!=null){
            if(!isLeaf(root)){
                res.add(cur.data);
            }

            if(cur.left != null){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
    }

    //adding the right boundary
    void addRight(Node root, List<Integer> res){
        Node cur = root.right;
        List<Integer> temp = new ArrayList<>();

        while(cur != null){
            if(!isLeaf(root)){
                temp.add(cur.data);
            }

            if(cur.right != null){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
        }
        for(int i = temp.size()-1; i>=0;--i){
            res.add(temp.get(i));
        }
    }

    void addLeaves(Node root, List<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }

        if(root.left != null){
            addLeaves(root.left, res);
        }

        if(root.right != null){
            addLeaves(root.right, res);
        }
    }

    List<Integer> printBoundary(Node root){

        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        if(!isLeaf(root)){
            res.add(root.data);
        }

        addLeft(root, res);
        addLeaves(root, res);
        addRight(root, res);

        return res;
    }

    void printResult(List<Integer> result){
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BoundaryTraversal bt = new BoundaryTraversal();

        List<Integer> result = bt.printBoundary(root);
        System.out.print("boundary traversal : ");
        bt.printResult(result);
    }
}
