package Leetcode.TwoPointer;
import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        int len = s.length();
        if (len == 0) return true;

        String new_s="";

        for(int i=0;i<s.length(); i++)
        {
            String curr = String.valueOf(s.charAt(i)).toLowerCase();
            if(curr.charAt(0) >= 'a' && curr.charAt(0) <= 'z') new_s += curr;
        }

        System.out.println(new_s);
        return true;
    };

    public static void main(String[] args) {
        isPalindrome("abAB , is an animal. and jere; is");
    }
}
