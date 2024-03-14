package Leetcode.Stack;
import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        int len=path.length();
        Stack<String> st = new Stack<String>();

        for(int i=0; i<len; )
        {
            char curr = path.charAt(i);
            if( curr == '/' )
            {
                if((i+1)<len && path.charAt(i+1) == '/')
                {
                    i++;
                    continue;
                }
                if( (i+1)<len && path.charAt(i+1) == '.')
                {
                    i++;
                    String str="/";
                    while(i<len && path.charAt(i) != '/')
                    {
                        str+=path.charAt(i);
                        i++;
                    }
                    if(str.equals("/..")){
                        if(!st.isEmpty())
                        {
                            st.pop();
                        }
                    }else{
                        if(!str.equals("/."))
                        {
                            st.push(str);
                        }
                    }
                    continue;
                }

                if( (i+1)<len && (
                        (path.charAt(i+1) >= 'a' && path.charAt(i+1) <= 'z') ||
                                (path.charAt(i+1) >= 'A' && path.charAt(i+1) <= 'Z') )
                )
                {
                    String str="/";
                    i++;
                    while(i<len && path.charAt(i) != '/')
                    {
                        str+=path.charAt(i);
                        i++;
                    }
                    st.push(str);
                    continue;
                }

                if(st.isEmpty())
                {
                    st.push(String.valueOf(curr));
                }
            }

            i++;

        }

        String finalstr = "";
        while(!st.isEmpty())
        {
            finalstr = st.pop()+finalstr;
        }
        if(finalstr.length() == 0) return "/";
        return finalstr;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
}
