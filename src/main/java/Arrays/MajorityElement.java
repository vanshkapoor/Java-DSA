package Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {15};
        int n=1;

        int limit = n/2;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i: a)
        {
            if(hmap.containsKey(i))
            {
                int initial = hmap.get(i);
                initial++;
                hmap.put(i, initial);
            }else{
                hmap.put(i, 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> e : hmap.entrySet())
        {
            if(e.getValue() > limit)
            {
                System.out.println("---------" + e.getKey());
            }
        }
    }
}
