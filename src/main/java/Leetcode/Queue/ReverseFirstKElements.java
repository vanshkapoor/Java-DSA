package Leetcode.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElements {

    public static void reverseK(Queue<Integer> q, int k)
    {
        reverseInitialK(q, k);

        int len = q.size()-k;
        while(len > 0)
        {
            q.add(q.remove());
            len--;
        }
    }

    private static void reverseInitialK(Queue<Integer> q, int k) {
        if(k==0) return;
        int ele = q.remove();
        reverseInitialK(q, k-1);
        q.add(ele);
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);

        int k=4;
        reverseK(q, k);

        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
