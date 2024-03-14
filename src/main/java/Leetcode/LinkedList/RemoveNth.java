package src.main.java.Leetcode.LinkedList;

class ListNode {
    int data;
    ListNode next;
    ListNode(int d)
    {
        this.data = d;
        this.next = null;
    }
}

public class RemoveNth {
    static int cnt=0;

    public ListNode removenth(ListNode temp, int target, int index)
    {
        if(temp == null) return temp;

        cnt++;
        ListNode nextTemp = removenth(temp.next, target,index+1);
        if(index == cnt-target) return nextTemp;
        temp.next = nextTemp;
        return temp;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        return this.removenth(head, n, 0);
    }

    public static void main(String[] args) {
        ListNode obj = new ListNode(1);
//        obj.next = new ListNode(2);
//        obj.next.next = new ListNode(3);
//        obj.next.next.next = new ListNode(4);
//        obj.next.next.next.next = new ListNode(5);

        RemoveNth rn = new RemoveNth();
        obj = rn.removeNthFromEnd(obj, 1);

    }
}
