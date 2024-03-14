package Leetcode.Backtracking;

import java.util.ArrayList;

public class Base {
    int arr[];

    Base(int arr[])
    {
        this.arr = arr;
    }

    public void getSubsets(int arr[], int index, int len, ArrayList<Integer> subsetList)
    {
        System.out.println(subsetList);

        for(int i=index; i<len; i++)
        {
            subsetList.add(arr[i]);
            getSubsets(arr, i+1, len, subsetList);
            subsetList.remove(subsetList.size()-1);
        }

    }


    public void getSubsetsWithoutBacktrack(int arr[], int index, int len, ArrayList<Integer> subsetList)
    {
        if(index >= len)
        {
            System.out.println(subsetList);
            return;
        }

        subsetList.add(arr[index]);
        getSubsetsWithoutBacktrack(arr, index+1, len, subsetList);
        subsetList.remove(subsetList.size()-1);
        getSubsetsWithoutBacktrack(arr, index+1, len, subsetList);

    }

    public void generateSubsets()
    {
        int[] arr = this.arr;
        int len = arr.length;
        ArrayList<Integer> subsetList = new ArrayList<Integer>();
        getSubsetsWithoutBacktrack(arr, 0, len, subsetList);

    }

    public void permutations(int[] arr, int index, int len)
    {
        if(index>len){ return; }

        for(int i=index; i<len; i++)
        {
//            swap(arr, i, index);
            permutations(arr, index+1, len);
//            swap(arr, i, index);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Base obj = new Base(arr);
        obj.generateSubsets();
    }
}
