package Leetcode.Arrays;
import java.util.*;
public class LongestSubstring {
    public static int  lengthOfLongestSubstring(String s) {
        int nm = Integer.MAX_VALUE;
        int len = s.length();
        HashSet<Character> hmap = new HashSet<Character>();
        int maxLen = 0;
        int currCount = 0;
        int i=0;
        int j=1;

        hmap.add(s.charAt(i));

        while(j<len && i<len)
        {
            if( hmap.contains( s.charAt(j) ))
            {
                hmap.remove( s.charAt(i) );
                i++;
                currCount--;
            } else {
                hmap.add( s.charAt(j) );
                j++;
                currCount++;
                maxLen = Math.max(maxLen, currCount);
            }

        }
        return maxLen+1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
