package Queue.Reverse;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {

    public static void reverse(Queue<Integer> q, int k){
        reverseInitial(q, k);
        for(int i=0; i<q.size()-k; i++)
        {
            int x = q.poll();
            q.add(x);
        }
    }

    private static void reverseInitial(Queue<Integer> q, int k) {
        if(q.size() == 0 || k ==0) return;
        int ele = q.poll();
        reverseInitial(q,k-1);
        q.add(ele);
    }

    static void display(Queue<Integer> q)
    {

    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        reverse(q, 3);
        q.poll();
        q.remove();
//        display(q);


    }
}
