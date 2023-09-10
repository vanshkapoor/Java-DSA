package Arrays;

import java.util.ArrayList;

public class SubArrayWithSum {

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;

        int currSum = arr[0];
        int sum = 23;
        int start = 0;

        for(int i=1;i<=n;i++)
        {
            while(currSum>sum && start < i-1)
            {
                currSum = currSum - arr[start];
                start++;
            }

            if(currSum == sum)
            {
                System.out.println(start + " - " + (i-1));
//                return finalArr;
            }


            if(i<n){
                currSum+=arr[i];
            }

        }

        ArrayList<Integer> finalArr = new ArrayList<>();
        finalArr.add(-1);
//        return finalArr;


    }
}
