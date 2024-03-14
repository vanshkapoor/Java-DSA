package src.main.java.Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveEle {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int k=nums.length-1;

//        Not the perfect soln
//        use loop - check notion
        while(i<k)
        {
            if(nums[i] == val)
            {
                while(nums[k]==val)
                {
                    k--;
                }
                nums[i]=nums[k];
                nums[k]=val;
                k--;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveEle obj = new RemoveEle();
        int[] ele = {3,2,2,3};
//        obj.removeElement(ele, 3);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        List<Integer> narr = arr.subList(0,3);
        Collections.sort(narr);

//        narr.indexOf()
        //        for(const auto i: narr)
//        {
//            System.out.println(i);
//        }

    }
}
