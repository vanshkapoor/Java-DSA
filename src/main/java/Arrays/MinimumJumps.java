package Arrays;
//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
public class MinimumJumps {

    int finalJumpCount = Integer.MAX_VALUE;

    public void getMinJumps(int[] arr, int len, int index, int jumpCount)
    {
            if(index >= len)
            {
                return;
            }

            int maxReachableIndex = index+arr[index];

            if(maxReachableIndex >= len)
            {
                finalJumpCount = Math.min(jumpCount+1, finalJumpCount);
                return;
//                return jumpCount+1;
            }

            if(arr[index] > 0)
            {
                for(int i=index+1; i<=maxReachableIndex; i++)
                {
                    getMinJumps(arr, len, i, jumpCount+1);
                }
            }

    }




    public static void main(String[] args) {
        MinimumJumps obj = new MinimumJumps();
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        obj.getMinJumps(arr,arr.length, 0, 0);
    }

}
