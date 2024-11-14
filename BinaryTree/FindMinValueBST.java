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
public class FindMinValueBST {

    public Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void inorder(Node root, List<Integer> list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }    


    public static void main(String args[]){
        Node root = new Node(22);
        FindMinValueBST bst = new FindMinValueBST();
        bst.insert(root, 12);
        bst.insert(root, 8);
        bst.insert(root, 20);
        bst.insert(root, 30);

        List<Integer> list =  new ArrayList<Integer>();
        bst.inorder(root, list);
        System.out.println(list.get(0));

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
