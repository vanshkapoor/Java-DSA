package Strings;

public class StringSplitBySpaces {
    public static void main(String[] args) {
        String s = "this is a 12 string and 1 2 3 another 34 string";

        String obj[] = s.split(" ");

        for(int i= obj.length-1; i>0; i--)
        {
            System.out.println(obj[i]);
        }

    }
}
