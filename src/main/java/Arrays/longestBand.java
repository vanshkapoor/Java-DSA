package Arrays;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

public class longestBand {
    public static void main(String[] args) {
        int arr[]={1,9,3,0,2,18,5,10,4,7,12,6,11};
        System.out.println(getLongestBand(arr));
    }

    private static int getLongestBand(int @NotNull [] arr) {
        int cnt=0;
        int maxcnt=0;
        HashSet<Integer> mainmap= new HashSet();

        //        basic loop
        for(int i=0;i<arr.length;i++)
        {
            mainmap.add(arr[i]);
        }


        for(int i=0;i<arr.length; i++)
        {
            if(!mainmap.contains(arr[i]-1))
            {
                cnt=1;
                int num=arr[i]+1;
                while (mainmap.contains(num))
                {
                    cnt++;
                    maxcnt=Math.max(maxcnt, cnt);
                    num++;
                }
            }
        }
        return maxcnt;
    }
}
