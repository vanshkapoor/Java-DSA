package Leetcode.Arrays;

public class Jump {

    public static boolean jumper(int arr[], int len, int index)
    {
        int indexJump = arr[index];
        if( (index + indexJump) >= len-1) return true;


        for(int i=index+1;i<=indexJump;i++)
        {
            return jumper(arr, len, i);
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,1,0};
        System.out.println(jumper(arr, arr.length, 0));
    }
}
