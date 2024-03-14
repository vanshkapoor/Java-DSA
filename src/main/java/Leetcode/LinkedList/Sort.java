package Leetcode.LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; next=null; }
}
public class Sort {
    private static int getLength(ListNode temp)
    {
        int len=0;
        while(temp!=null)
        {
            len++;
            temp = temp.next;
        }
        return len;
    }

    private static void display(ListNode obj)
    {
        while(obj!=null)
        {
            System.out.println(obj.val);
            obj=obj.next;
        }

        System.out.println("----------------");
    }

    public static ListNode sortList(ListNode head) {
        int len = getLength(head);
        ListNode h1 = head;

        while(h1!=null)
        {
            int data = h1.val; // 4
            ListNode r1 = h1.next; // 2
            ListNode temp = r1;

            if(r1 == null) return head;
            while(r1!=null)
            {
                if(r1.val<data)
                {
                    data = r1.val;
                    temp = r1;
                }
                r1=r1.next;
            }

            // swap data
            int t = h1.val;
            h1.val = temp.val;
            temp.val = t;
            display(head);

            h1 = h1.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode obj = new ListNode(4);
        obj.next = new ListNode(2);
        obj.next.next = new ListNode(1);
        obj.next.next.next = new ListNode(3);

        obj = sortList(obj);

        while(obj!=null)
        {
            System.out.println(obj.val);
            obj=obj.next;
        }

    }
}
