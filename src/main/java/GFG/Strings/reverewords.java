package GFG.Strings;

import java.util.Stack;

public class reverewords {

    public static String reverseWords(String s) {
        String rev="";
        int ln = s.length();
        
        for (int i = ln - 1; i >= 0; i--)
        {
            char curr = s.charAt(i);
            rev= rev + String.valueOf(curr);
        }
        return rev;
    } 


    public static void main(String[] args) {
        String s = "I am.vansh kapoor";

        String[] arr = s.split("\\.");
        Stack<String> stack = new Stack<String>();

        for(String str:arr){
            System.out.println("->"+ str);
            stack.push(str);
        }

        String finalstr="";
        while(!stack.empty())
        {
            String news = stack.pop();
            finalstr+=news+" ";
        }
        System.out.println(finalstr.trim());


        System.out.println(reverseWords("GeeksForGeeks gfg"));











    }
}
