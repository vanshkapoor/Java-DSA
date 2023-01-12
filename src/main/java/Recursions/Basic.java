package Recursions;

import java.util.ArrayList;

public class Basic {
    public int factorial(int n) {
        if (n <= 0) {
            return 1;
        }

        int num = factorial(n - 1);
        return n * num;
    }

    public int fibo(int num) //0 - 1 - 1 - 2 - 3 - 5 - 8
    {
        if(num <= 0)
        {
            return 0;
        }
        if(num == 1)
        {
            return 1;
        }

        return fibo(num-1) + fibo(num-2);
    }

    public int sumarr(ArrayList<Integer> arr, int len)
    {
        if(len == 0)
        {
            return 0;
        }

        int num = arr.get(len);
        arr.remove(len);
        return num + sumarr(arr, len-1);
    }

    public static void main(String[] args) {


    }
}
