package Recursions;

import java.util.ArrayList;

public class BinarySearch {

    static int binarysimple(int item, ArrayList<Integer> arr)
    {
        int beg = 0;
        int end = arr.size()-1;

        while (beg<=end)
        {
            int mid = (beg+end)/2;
            if(arr.get(mid) == item)
            {
                return mid;
            }
            if(arr.get(mid) > item)
            {
                end = mid-1;
            }
            else{
                beg = mid+1;
            }
        }

        return -1;
    }

    static int binaryrec(int item, ArrayList<Integer> arr, int beg, int end)
    {
        if(beg>=end)
        {
            return -1;
        }
        int mid = (beg+end)/2;
        if(arr.get(mid) == item)
        {
            return mid;
        }

        if(arr.get(mid) > item)
        {
            return binaryrec(item, arr, beg, mid-1);
        }
            return binaryrec(item, arr, mid+1, end);
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(4);
                add(5);
                add(6);
                add(8);
                add(10);
                add(13);
                add(15);
                add(16);

            }
        };

        System.out.println(binaryrec(4,arr,0,arr.size()-1));
        System.out.println(binarysimple(4,arr));


    }

}
