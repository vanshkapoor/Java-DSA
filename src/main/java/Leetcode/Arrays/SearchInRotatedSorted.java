package src.main.java.Leetcode.Arrays;

public class SearchInRotatedSorted {

    public static int search(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;


        while(beg<end)
        {
            int mid = (beg+end)/2;

            if(nums[mid] == target) return mid;

            if(nums[mid]>=nums[beg])
            {
                if(target<=nums[mid] && target>=nums[beg])
                {
                    end=mid;
                }else{
                    beg=mid;
                }
            }else{
                if(target>=nums[mid] && target<=nums[end])
                {
                    beg=mid;
                }else{
                    end=mid;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
}
