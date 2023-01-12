package Recursions;

import java.util.ArrayList;

public class Arrays {
    static int num = 0;

    //    [1,5,3,6,2,7] =>
    static void getLargestElement(ArrayList<Integer> arr, int len)
    {
        if(len == 0)
        {
            return;
        }

        num = Math.max(arr.get(0),num);
        arr.remove(0);
        getLargestElement(arr, len-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(){
            {
                add(1);
                add(6);
                add(9);
                add(10);
            }
        };
        getLargestElement(arr, 4);

        System.out.println(num);
    }
}
