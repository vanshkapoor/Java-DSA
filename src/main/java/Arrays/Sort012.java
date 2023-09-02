package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Sort012 {

    public static void main(String[] args) {
        int a[] = {0,1,0,1,1,0,2,1,0,1,2};
        int len = a.length;

        int beg = 0;
        int med=0;
        int end = a.length - 1;

        while(med<=end)
        {
            if(a[med] == 0)
            {
                swap(a, beg, med);
                beg++;
                med++;
            }
            else if (a[med] == 1)
            {
                med++;
            }
            else{
                swap(a, end, med);
                end--;
            }
        }
        System.out.println(a);
    }

    public  static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
