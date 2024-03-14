package src.main.java.Leetcode.String;

public class Substrings {

    private void printAllSubsets(String s, String rs)
    {
        if(s.length() == 0) {
            System.out.println(rs);
            return;
        };

        printAllSubsets(s.substring(1), rs+s.substring(0,1));
        printAllSubsets(s.substring(1), rs);
    }

    public static void printSubstrings(String str) {
        if (str.length() == 0) {
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i+1));
            printSubstrings(str.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        Substrings obj = new Substrings();
//        obj.printAllSubsets("abcd", "");
//        printSubstrings("abc");

        String s = "abcd";
        printSubstrings(s);

        //        System.out.println(s.substring(0, 3));
    }
}
