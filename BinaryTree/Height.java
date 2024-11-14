package BinaryTree;

class Node {
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class Height {

    int heightOfBTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfBTree(root.left);
        int rightHeight = heightOfBTree(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String args[]){
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(4);

        Height h = new Height();
        int height = h.heightOfBTree(root);
        System.out.println(height);

    }
}
