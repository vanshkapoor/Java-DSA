package Tree;


public class BST {
    Node root;

    boolean checkIfBST(Node temp){
        if(temp == null) return true;

        if(temp.left == null && temp.right == null) {
            return true;
        }

        if(temp.left != null && temp.right != null){
            return temp.left.data < temp.data
                    && temp.data < temp.right.data
                    && checkIfBST(temp.left) && checkIfBST(temp.right);
        }

        return false;
    }

//Approach 2: max value from left smaller than node and greater than min value in right.

    boolean checkForBST(Node temp){
        if(temp == null) return true;

        if(temp.left == null && temp.right == null) {
            return true;
        }

        if(temp.left!=null && temp.right!=null){
            int lmax = maxVal(temp.left);
            int rmin = minVal(temp.right);
            return temp.data > lmax && temp.data < rmin;
        }

        return false;
    }

    int maxVal(Node temp)
    {
        if(temp == null) return 0;

        return Math.max(Math.max(maxVal(temp.left), maxVal(temp.right)), temp.data);
    }

    int minVal(Node temp)
    {
        if(temp == null) return Integer.MAX_VALUE;

        return Math.min(Math.min(minVal(temp.left), minVal(temp.right)), temp.data);
    }

    Node mirror(Node temp)
    {
        if(temp == null) return temp;

        Node left = mirror(temp.left);
        Node right = mirror(temp.right);

        temp.right = left;
        temp.left = right;

        return  temp;
    }



    public static void main(String[] args) {
        BST b = new BST();
        b.root = new Node(5);
        b.root.left = new Node(3);
        b.root.left.right = new Node(4);
        b.root.left.left = new Node(2);
        b.root.right = new Node(8);
        b.root.right.left = new Node(7);
        b.root.right.right = new Node(9);

        System.out.println(b.checkIfBST(b.root));
        System.out.println("--------------------");
        System.out.println(b.checkForBST(b.root));
        System.out.println("--------------------");
        System.out.println(b.maxVal(b.root));

    }
}
