package src.main.java.Leetcode.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int len = nums.length;
            if(len==0) return new int[0];
            if(len<k)
            {
                int res[] = new int[1];
                int max = nums[0];
                for(int i: nums)
                {
                    max = Math.max(max, i);
                }
                res[0] = max;
                return res;
            }
            int res[] = new int[len-k+1];
            for(int i=0; i<len-k+1; i++)
            {
                int max = nums[i];
                for(int j=1; j<k; j++)
                {
                    if(nums[i+j] > max)
                    {
                        max = nums[i+j];
                    }
                }
                res[i] = max;
            }
            return res;
        }

    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int len = nums.length;

        for(int i=0; i<k; i++ )
        {
            while ( !deque.isEmpty() && nums[deque.peekLast()] < nums[i] ) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        int[] mres = new int[len-k+1];
        int index = 0;
        mres[index] = nums[deque.peekFirst()];

        for(int i=k; i<len; i++)
        {
            index++;
            while ( !deque.isEmpty() && deque.peekFirst() < i-k+1)
            {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i] )
            {
                deque.removeLast();
            }
            deque.addLast(i);

            mres[index] = nums[deque.peekFirst()];
        }

        return mres;
    };


    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(maxSlidingWindow2(nums, k));
    }
}
