package Strings;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String S = "A a The quick brown fox jumps over the dog";
//        check for pangram.
        checkIfPangram(S);
    }

    private static boolean checkIfPangram(String s) {
        int arr[] = new int[26];
        Arrays.setAll(arr, i-> 0);
        int index = 0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                index = s.charAt(i)-'A';
            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                index = s.charAt(i)-'a';
            }
            else 
                continue;

            System.out.println(index);
            arr[index] = 1;
        }
        
        for(int i=0;i<26;i++)
        {
            if(arr[i] == 0)
            {
                char ch = (char) (i+'a');
                System.out.println(ch);
            }
        }
        
        return false;
    }
}
