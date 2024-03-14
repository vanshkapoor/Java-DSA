package Linkedlist;

import java.util.HashMap;

public class LRUCache {
    int capacity;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    };
    Node head, tail;
    HashMap<Integer, Node> cache = new HashMap<Integer, Node>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(-1);
        this.tail = new Node(-1);
    }

    public int get(int key) {
        if(this.cache.get(key) != null)
        {
            Node item = this.cache.get(key);
            System.out.println(item.data);

        }

        return -1;
    }

//    private void remove(int value)
//    {
//        Node temp = this.tail.next;
//        while(temp.data !=value)
//        {
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        temp.next
//    }
    private void addNode(int key, int value)
    {
        Node temp = new Node(value);
        this.head.prev.next=temp;
        temp.prev = this.head.prev;
        this.head.prev = temp;
        this.cache.put(key, temp);
        return;
    }

    public void put(int key, int value) {
            if(this.cache.size() == 0 )
            {
                Node temp = new Node(value);
                this.head.prev = temp;
                this.tail.next = temp;
                this.cache.put(key, temp);
                return;
            }
            else if(this.cache.size()>0 && this.cache.size() < capacity)
            {
                this.addNode(key, value);
                return;
            }
            else if(this.cache.size() == capacity)
            {
                this.cache.remove(this.tail.next.data);
                this.tail.next = this.tail.next.next;
                this.tail.next.prev = null;
                this.addNode(key, value);
            }
    }


    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        obj.put(1,1);
        obj.put(2,2);
        int param_1 = obj.get(1);
        obj.put(3,3);
        int param_2 = obj.get(2);
    }
}
