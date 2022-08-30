package Strings;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s1 = "aabccd";
        String s2 = "xxyzzd";
        HashMap<Character, Character> isomap = new HashMap<>();
        String newString="";

        for(int i=0;i<s1.length();i++)
        {
            if(!isomap.containsKey(s1.charAt(i))) {
                isomap.put(s1.charAt(i), s2.charAt(i));
            }
            newString+=isomap.get(s1.charAt(i));
        }
        System.out.println(newString);
        if(newString.equals(s2)){
            System.out.println("ISOMORPHIC");
        }else{
            System.out.println("NOO");
        }
    }
}
