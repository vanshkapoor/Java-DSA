package Leetcode.LinkedList.recursion;

class LinkedList{
    public Node head;
    LinkedList()
    {
        this.head=null;
    }
}

class Node {
    int data;
    Node next;

    Node(int d)
    {
        this.data=d;
        this.next=null;
    }
}


public class Mid {
    int cnt=0;
    public Node findMid(Node head, int index)
    {
        if(head == null) return head;
        this.cnt+=1;
        head.next = findMid(head.next, index+1);
        if(index == cnt/2)
        {
            System.out.println(head.data);
            return head.next;
        }
        return head;
    }

    public void display(Node head)
    {
        while (head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(4);
        Mid obj = new Mid();
        obj.findMid(ll.head, 0);
        obj.display(ll.head);
    }


}
