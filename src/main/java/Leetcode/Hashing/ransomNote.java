package Leetcode.Hashing;

public class ransomNote {
    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        for(int i=0; i<pattern.length(); i++)
        {
            s = s.replaceAll( arr[i],  String.valueOf(pattern.charAt(i)) );
        }

        String[] news = s.split(" ");
        s = String.join("", news);

        System.out.println(pattern + s);
        System.out.println(pattern.equals(s));
        return pattern.equals(s);

    }

    public static void main(String[] args) {
        wordPattern("abc", "b c a");
    }
}
