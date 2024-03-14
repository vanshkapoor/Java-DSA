package src.main.java.Leetcode.Stack;
import java.util.*;
public class ParanthesisCheck {

    private boolean canPush(String s)
    {
        switch(s)
        {
            case "{":
            case "[":
            case "(": return true;
            default: return false;
        }
    }

    private boolean toPop(String s)
    {
        switch(s)
        {
            case "}":
            case "]":
            case ")": return true;
            default: return false;
        }
    }

    private Integer getVal(String s)
    {
        switch(s)
        {
            case "{": return 1;
            case "[": return 2;
            case "(": return 3;
            default : return 0;
        }
    }

    private Integer getValForPop(String s)
    {
        switch(s)
        {
            case "}": return 1;
            case "]": return 2;
            case ")": return 3;
            default : return 0;
        }
    }

    private boolean canPop(String toAdd, String toPop)
    {
        if(getValForPop(toAdd) == getVal(toPop))
        {
            return true;
        }
        return false;
    }


    public boolean isValid(String s) {
        int len = s.length();
        if(len == 0) return true;
        String[] substrings = s.split("");

        Stack<String> st = new Stack<String>();

        for(String curr : substrings)
        {
            if(canPush(s))
            {
                st.push(curr);
            }else{
                if(!st.isEmpty() && !canPop(curr, st.peek()))
                {
                    return false;
                }
                else{
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
//        ParanthesisCheck obj = new ParanthesisCheck();
//        obj.isValid("(]");


//            Stack<Integer, Integer> st = new Stack<Integer, Integer>();
//            st.push();
    }
}
