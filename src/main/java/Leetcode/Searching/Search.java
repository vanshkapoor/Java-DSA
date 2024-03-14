package Leetcode.Searching;

import Leetcode.OOPS.Abstraction.Square;

public class Search {
    int[] arr;
    Search(int[] arr)
    {
        this.arr = arr;
    }

    private int binarySearch(int target)
    {
        int len = this.arr.length;
        int beg=0;
        int end=len-1;

        while(beg<=end)
        {
            int mid = (beg+end)/2;

            if(this.arr[mid] == target)
            {
                System.out.println(mid);
                return mid;
            }
            if(target>arr[mid] && target<=arr[end])
            {
                beg=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        Search obj = new Search(arr);
        obj.binarySearch(2);

//        Square sq = new Square(4);  Sample try to access a public class in another package

    }
}
