package Strings;

public class MaxUniqueOccurenceSubstring {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";

        System.out.println(getMaxLengthOfUniqueCharacterSubString(s));
    }

    private static int getMaxLengthOfUniqueCharacterSubString(String s) {
        String ns = "";
        int maxnum = -1;
        for(int i=0;i<s.length();i++)
        {
            if(ns.contains(String.valueOf(s.charAt(i))))
            {
                ns = ns.substring(ns.indexOf(s.charAt(i))+1);
            }
            ns+=String.valueOf(s.charAt(i));
            maxnum = Math.max(ns.length(), maxnum);
        }
        return maxnum;
    }
}
