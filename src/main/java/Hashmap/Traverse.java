package Hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Traverse {

    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        hmap.put("A1", 1);
        hmap.put("B1", 6);
        hmap.put("C1", 12);
        hmap.put("D1", 4);
        hmap.put("E1", 7);


//        hmap.getOrDefault()
//        Traverse types
//        Type 1
        for(String s: hmap.keySet())
        {
            System.out.println(hmap.get(s));
        }

        System.out.println(hmap.entrySet());

//        Type 2
        for(Map.Entry<String, Integer> entry: hmap.entrySet())
        {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }


//        sorting
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList< Map.Entry<String, Integer> >( hmap.entrySet() );

        Collections.sort(
                list,
                (i1, i2) -> i1.getValue().compareTo(i2.getValue())
        );

        for(Map.Entry<String, Integer> item: list)
        {
            System.out.println("-------" + item.getKey());
        }



    }
}
