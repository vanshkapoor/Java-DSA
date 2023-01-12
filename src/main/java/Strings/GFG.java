package Strings;

import java.util.HashSet;
import java.util.Stack;

public class GFG {

    public static Character returnParanthesisPair(Character ch)
    {
        Character pair;
        switch (ch)
        {
            case '}': pair='{';break;
            case ']': pair='[';break;
            case ')': pair='(';break;
            default: return '-';
        }
        return pair;
    }
    public static void paranthesisChecker()
    {
        String s= "()";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.empty()){
                stack.push(s.charAt(i));
            }
            else if(stack.peek() == returnParanthesisPair(s.charAt(i)))
            {
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty())
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        paranthesisChecker();
    }
}
