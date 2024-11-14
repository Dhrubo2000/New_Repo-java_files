package BinaryTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Floor_in_BST {

    int findFloor(Node root, int x){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        if(root.data == x){
            return root.data;
        }

        if(root.data < x){
            int floorVal = findFloor(root.right, x);
            //return (floorVal <= x) ? floorVal : root.data; 
            if(floorVal <= x){
                return floorVal;
            }
            return root.data;
        }

        return findFloor(root.left, x);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(30);
        
        Floor_in_BST f = new Floor_in_BST();
        int floor_value = f.findFloor(root, 14);

        System.out.println(floor_value);

    }
}
