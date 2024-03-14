package Leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

    public static void calc()
    {
        HashSet<Character> hmap = new HashSet<Character>();
        String s = "PWWKEW";
        int i=0;
        int len=s.length();

        hmap.add(s.charAt(i++));
        int j=0;
        int maxLen=0;

        while( i>j && i<len )
        {
            if(hmap.contains(s.charAt(i)))
            {
                hmap.remove(s.charAt(j++));
            }else{
                hmap.add(s.charAt(i++));
                maxLen = Math.max(maxLen, i-j+1);
            }
        }

        System.out.println("maxLen" + maxLen);

    }

    public static void main(String[] args) {
        calc();
    }

}
