package Strings;

import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        String s = "jbjnfbajdnkds";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int nm =map.get(s.charAt(i));
                nm++;
                System.out.println(s.charAt(i) + " - " + nm);
                map.put(s.charAt(i), nm);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
    }
}
