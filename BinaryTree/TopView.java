package BinaryTree;

import java.util.*;
import java.util.Map.Entry;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    int hd;
    Node node;

    Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}

public class TopView {

    ArrayList<Integer> topview(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        q.add(new Pair(0, root));

        while(!q.isEmpty()){
            Pair cur = q.remove();
            int hd = cur.hd;
            Node temp = cur.node;

            if(map.get(hd) == null){
                map.put(hd, temp.data);
            }

            if(temp.left!=null){
                q.add(new Pair(hd-1, temp.left));
            }

            if(temp.right!=null){
                q.add(new Pair(hd+1, temp.right));
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            ans.add(e.getValue());
        }
        ans.sort(null);

        return ans;

    }
    public static void main(String args[]){
        Node root = new Node(22);
        root.left = new Node(12);
        root.left.left = new Node(8);
        root.left.right = new Node(20);
        root.right = new Node(30);

        TopView tv = new TopView();
        ArrayList<Integer> res = tv.topview(root);
        System.out.print(res+ " ");
    }
}
