package Recursions;

class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    void insertNode(int data, Node temp)
    {
        if(this.head == null) {
            this.head = new Node(data);
            return;
        }
        if(temp.next != null){
            insertNode(data, temp.next);
        }else{
            temp.next = new Node(data);
        }
        return;
    }

    // approach 2
    Node insertAtEnd(int data, Node head)
    {
        if(head == null)
        {
            return new Node(data);
        }
        head.next = insertAtEnd(data, head.next);
        return head;
    }

    void display(Node temp)
    {
        if(temp == null){
            return;
        }
        System.out.println(temp.data);
        display(temp.next);
    }


    int getMiddle(Node temp, int i)
    {
        if(temp==null)
        {
            return i;
        }

        int len = getMiddle(temp.next, i+1);
        if(i == len/2)
        {
            System.out.println(temp.data);
        }
        return len;
    }




    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertNode(10, obj.head);
        obj.insertNode(14, obj.head);
        obj.insertNode(15, obj.head);
        obj.insertNode(19, obj.head);
        obj.insertNode(20, obj.head);
        obj.insertNode(23, obj.head);
        obj.insertNode(25, obj.head);
        obj.insertNode(27, obj.head);


        obj.display(obj.head);

        obj.getMiddle(obj.head, 0);

    }
}
