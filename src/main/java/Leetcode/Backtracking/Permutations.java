package Leetcode.Backtracking;

import java.util.ArrayList;

public class Permutations {

    static void perm(int[] arr, int len, int index)
    {
        for(int i=index;i<len; i++)
        {
//            swap();
            perm(arr, len, i+1);
//            swap();
        }

    }

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] arr = {1,2,3};
        perm(arr, arr.length, 0);


    }
}
