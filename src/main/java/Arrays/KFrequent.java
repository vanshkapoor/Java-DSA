package Arrays;
import java.util.*;
public class KFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len];

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i: nums)
        {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }

        ArrayList< Map.Entry<Integer, Integer> > list = new ArrayList< Map.Entry<Integer, Integer> >(hmap.entrySet());

        Collections.sort( list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()) );

        int[] returnarr = new int[k];
        int index = 0;
        for( Map.Entry<Integer, Integer> i: list )
        {
            if(index < k)
            {
                returnarr[index] = i.getKey();
            }else{
                break;
            }
            index++;
        }
        return returnarr;
    }

    public static void main(String[] args) {
        int arr[] = {4, 9, 1, 2, 5, 6, 4, 2, 1, 2, 4, 4};

//        Arrays.sort(arr);

        topKFrequent(arr, 2);


    }
}
