package Leetcode.Sorting;

public class Merge {
    static int cnt = 0;

    static void merge(int[] arr, int l, int m, int r)
    {
        int l1_len = m-l+1;
        int l2_len = r-m;
        int[] l1 = new int[l1_len];
        int[] r1 = new int[l2_len];

        int i=0,j=0;
        while(i<l1_len)
        {
            l1[i] = arr[l+i];
            i++;
        }

        while(j<l2_len)
        {
            r1[j] = arr[m+j+1];
            j++;
        }

        i=0;
        j=0;
        int k=l;

        while(i<l1_len && j<l2_len)
        {
            if(l1[i]<=r1[j])
            {
                arr[k]=l1[i];
                i++;
            }
            else
            {
                arr[k]=r1[j];
                System.out.println(l1[i] + " - " + r1[j]);
                j++;
                cnt+=l1_len-i;
            }
            k++;
        }

        while(i<l1_len)
        {
            arr[k]=l1[i];
            k++;
            i++;
        }


        while(j<l2_len)
        {
            arr[k]=r1[j];
            k++;
            j++;
        }

    }

    static void sort(int[] arr, int l, int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        sort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(cnt);
    }

}
