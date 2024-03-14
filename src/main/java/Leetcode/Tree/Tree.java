package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
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

    public static void inorder(Node head)
    {
        if(head == null) return;

        inorder(head.left);
        System.out.println(head.data);
        inorder(head.right);
    }

    public static void levelOrder(Node head)
    {
        Queue<Node> Q = new LinkedList<Node>();

        if(head !=null)
        {
            Q.add(head);
        }

        while (!Q.isEmpty())
        {
            Node temp = Q.remove();
            System.out.println(temp.data);
            if(temp.left != null )
            {
                Q.add(temp.left);
            }
            if(temp.right != null )
            {
                Q.add(temp.right);
            }
        }


    }



    public static void main(String[] args) {
        Node head = null;
        Node obj = new Node(1);
        obj.left = new Node(2);
        obj.right = new Node(3);
        obj.left.left = new Node(4);
        obj.left.right = new Node(5);
        obj.right.left = new Node(6);
        obj.right.right = new Node(7);

        head = obj;

//        inorder(head);
        levelOrder(head);
    }
}
