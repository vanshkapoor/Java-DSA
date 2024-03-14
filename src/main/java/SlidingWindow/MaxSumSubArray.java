package SlidingWindow;

import java.util.HashMap;

// maximum sum sub array of size k
public class MaxSumSubArray {
    public static int subArraySum()
    {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        int len = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int i=0;

        for(; i<k; i++)
        {
            sum+=arr[i];
        }
        maxSum = Math.max(sum, maxSum);
        int j=0;

        while(i<len)
        {
            sum-=arr[j++];
            sum+=arr[i++];
            maxSum=Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Boolean> uniqmap = new HashMap<Integer, Boolean>();
        int i=0;
        int sum=0;
        int maxSum=0;
        int len=nums.length;
        boolean unique = true;

        if(k>len) return 0;

        for(;i<k;i++)
        {
            if(uniqmap.get(nums[i])!=null)
            {
                unique = false;
            }
            uniqmap.put(nums[i], true);
            sum+=nums[i];
        }

        if(unique){
            maxSum = Math.max(maxSum, sum);
        }
        int j=0;

        while(i<len)
        {
            uniqmap.remove(nums[j]);
            if(uniqmap.get(nums[i]) != null )
            {
                unique=false;
            }else{
                unique=true;
            }
            uniqmap.put(nums[i], true);
            sum+=nums[i++];
            sum-=nums[j++];

            if(unique){
                maxSum=Math.max(sum, maxSum);
            }

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,9,4,9,2,9,9,9};
        System.out.println(maximumSubarraySum(arr, 3));
    }
}
