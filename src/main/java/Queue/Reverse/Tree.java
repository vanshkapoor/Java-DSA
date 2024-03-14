package Queue.Reverse;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    Node head;

    private void getLevelWithMaxNodes()
    {
        Queue<Node> Q = new LinkedList<Node>();
        if(this.head == null) return;
        Q.add(this.head);
        int maxLen = 1;

        while (!Q.isEmpty())
        {
            int len = Q.size();
            int i=0;
            maxLen = Math.max(maxLen, len);
            while (i<len) {
                Node node = Q.poll();
                if(node.left != null)
                {
                    Q.add(node.left);
                }
                if(node.right != null)
                {
                    Q.add(node.right);
                }
                i++;
            }

        }

        System.out.println("------>" + maxLen);
    }

    private int minHeight(Node temp)
    {
        if(temp == null) return 0;

        int lh = minHeight(temp.left);
        int rh = minHeight(temp.right);

        return Math.min(lh, rh) + 1;
    }



    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.head = new Node(1);
        tree.head.left = new Node(2);
        tree.head.right = new Node(3);
        tree.head.right.left = new Node(6);
        tree.head.left.left = new Node(4);
        tree.head.left.right = new Node(5);
        tree.head.left.left.left = new Node(7);
        tree.head.left.left.right = new Node(8);

        tree.getLevelWithMaxNodes();



        System.out.println(tree.minHeight(tree.head));

    }
}
