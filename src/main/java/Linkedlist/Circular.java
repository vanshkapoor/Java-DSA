package Linkedlist;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertData(int data) {
        Node newObj = new Node(data);

        if (this.head == null)
        {
            this.head = newObj;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newObj;
    }

    public void printData() {
        Node temp = head;

        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeDuplicate()
    {
        Node temp = head;
        Node i = head;
        while(i!=null)
        {
            while( i.next!=null && i.next.data == i.data)
            {
                i=i.next;
            }
            i=i.next;
            temp.next=i;
            temp=i;
        }
    }

}

public class Circular {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertData(1);
        ll.insertData(2);
        ll.insertData(2);
        ll.insertData(2);
        ll.insertData(3);
        ll.insertData(3);
        ll.insertData(4);
        ll.printData();
        ll.removeDuplicate();
        ll.printData();
    }
}
