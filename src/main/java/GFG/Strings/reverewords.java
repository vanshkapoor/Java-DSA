package GFG.Strings;

import java.util.Stack;

public class reverewords {
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
    }
}
