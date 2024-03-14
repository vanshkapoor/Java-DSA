package Arrays;

import java.util.ArrayList;

public class CyclicRotate {
    public static void main(String[] args) {
        int arr[] = {9,8,7,5,4,2,1};

        int n = arr.length;

        int rotateCnt = 3;

        for(int i=0; i<rotateCnt; i++)
        {
            rotateByOne(arr, n);
        }

        for (int i: arr)
        {
            System.out.println(i);
        }

    }

    public static void rotateByOne(int arr[], int n)
    {
        int lastItem = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = lastItem;
    }
}
