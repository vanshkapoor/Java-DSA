package Recursions;

public class StringObj {

    static void reverseString(String s)
    {
        if(s.length() <= 0)
        {
            return;
        }
        char fs = s.charAt(s.length()-1);
        System.out.println(fs);
        reverseString(s.substring(0,s.length()-1));
    }

    static String revString(String s)
    {
        if(s.isEmpty())
        {
            return s;
        }
        return  revString(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "Vansh Kapoor";
        reverseString(s);
        System.out.println(revString(s));
    }
}
