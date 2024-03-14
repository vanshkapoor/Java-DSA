package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree(){
        root = null;
    }
    void inorder(Node temp){
        if(temp == null) return;

        System.out.println(temp.data);
        inorder(temp.left);
        inorder(temp.right);
    }
    void insert(int data){
        root = insertRec(data, root);
    }
    Node insertRec(int data, Node temp){ //Doesnt work with recursion
        if(temp == null){
            return new Node(data);
        }

        if(temp.left == null){
            temp.left = insertRec(data, temp.left);
        }
        else if(temp.right == null){
            temp.right = insertRec(data, temp.right);
        }
        return temp;
    }

    void levelOrderTraversal(){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();

            System.out.println(temp.data);

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }

        }
    }

    void insertLevelOrder(int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            Node temp = queue.peek();
            queue.remove();

            if(temp.left == null){
                temp.left = new Node(data);
                return;
            }
            queue.add(temp.left);

            if(temp.right == null){
                temp.right = new Node(data);
                return;
            }
            queue.add(temp.right);
        }
    }

    int height(Node temp)
    {
        if(temp == null) return 0;

        int nl = height(temp.left);
        int nr = height(temp.right);

        return Math.max(nl, nr) + 1;
    }

    void displayBFS(Node temp, int len, int curr)
    {
        if(temp == null) return;
        if(curr == len) System.out.println(temp.data);

        if(temp.left != null){
            displayBFS(temp.left, len, curr+1);
        }
        if(temp.right != null){
            displayBFS(temp.right, len, curr+1);
        }
    }

    void BFS()
    {
        int h = height(this.root);

        for(int i=1;i<=h;i++)
        {
            displayBFS(this.root, i, 1);
        }
    }

    void printZigZag(Node temp, int len, int curr, boolean LToR)
    {
        if(temp == null) return;
        if(len == curr) { System.out.println(temp.data); return; }

        if(LToR){
            if(temp.left!=null){
                printZigZag(temp.left, len, curr+1, LToR);
            }
            if(temp.right!=null){
                printZigZag(temp.right, len, curr+1, LToR);
            }
        }else{
            if(temp.right!=null){
                printZigZag(temp.right, len, curr+1, LToR);
            }
            if(temp.left!=null){
                printZigZag(temp.left, len, curr+1, LToR);
            }
        }
    }

    void zigzag()
    {
        int h = height(this.root);
        boolean LToR = true;
        for(int i=1; i<=h; i++)
        {
            printZigZag(this.root, i, 1, LToR);
            LToR = !LToR;
        }
    }


    void maxValueEachLevel()
    {
        int h = height(this.root);
        ArrayList<Integer> arr = new ArrayList<Integer>(h);
        for(int i=1; i <= h; i++)
        {
            maxLevelOrder(this.root, i, 1, arr);
        }

        for(int i: arr){
            System.out.println("---------" + i);
        }
    }

    private void maxLevelOrder(Node temp, int len, int curr, ArrayList<Integer> arr) {
        if(temp == null) return;

        if(len == curr){

            if(arr.size() == curr)
            {
                int topElement = arr.remove(curr-1);
                arr.add(Math.max(topElement, temp.data));
            }else{
                arr.add(temp.data);
            }
            return;
        }

        if(temp.left!=null){
            maxLevelOrder(temp.left, len, curr+1, arr);
        }

        if(temp.right!=null){
            maxLevelOrder(temp.right, len, curr+1, arr);
        }

    }


    void diameter(Node temp)
    {
        if(temp == null) return;

        int lh = height(temp.left);
        int rh = height(temp.right);

        System.out.println(lh+rh+1);
    }

}


public class Basic {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right.right = new Node(8);
        t.root.right.left = new Node(9);

        t.insertLevelOrder(10);
        t.insertLevelOrder(12);

//        t.levelOrderTraversal();
//        t.inorder(t.root);
        t.BFS();
        System.out.println("zigzag-------------");
        t.zigzag();
        System.out.println("height-------------");
        System.out.println(t.height(t.root));
        System.out.println("maxValueEachLevel-------------");
        t.maxValueEachLevel();
        System.out.println("diameter -------------");
        t.diameter(t.root);
    }

}
