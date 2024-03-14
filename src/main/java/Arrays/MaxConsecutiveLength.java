package Arrays;
import java.util.*;
public class MaxConsecutiveLength {

    public static int longestConsecutive(int[] nums) {
        int len = nums.length;

        if(len == 0) return 0;

        Arrays.sort(nums);

        int arr[] = new int[len];
        int j=0;
        for(int i=0; i<len-1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                arr[j++] = nums[i];
            }
        }
        arr[j]=nums[len-1];


        int conslen = 0;
        int maxConsLen = 0;
        for(int i=0; i <= j - 1; i++)
        {

            if( arr[i]+1 == arr[i+1] )
            {
                conslen = conslen+1;
            }else{
                maxConsLen = Math.max(maxConsLen, conslen);
                conslen = 0;
            }
        }

        return Math.max(maxConsLen, conslen) + 1;
    }


    public static void main(String[] args) {
        int arr[] = { 0,3,7,2,5,8,4,6,0,1 };
        System.out.println(longestConsecutive(arr));
    }
}
