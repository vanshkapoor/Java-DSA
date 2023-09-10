package Arrays;

import java.util.HashMap;

public class PairWithGivenSum {

    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        int n=4;
        int k=2;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(hmap.containsKey(k-arr[i]))
            {
                count+=hmap.get(k-arr[i]);
            }
            if(hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i], hmap.get(arr[i]) + 1 );
            }
            else {
                hmap.put(arr[i], 1);
            }
        }

        System.out.println(count);

    }
}
