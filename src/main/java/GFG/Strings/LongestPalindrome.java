package GFG.Strings;

public class LongestPalindrome {

    public static int getPalindromeLength(String s)
    {
        StringBuilder inp1 = new StringBuilder();
        inp1.append(s);
        inp1.reverse();
        StringBuilder inp2 = new StringBuilder();
        inp2.append(s);
        if(inp1.toString().equals(inp2.toString())) //stringbuilder does not have equals
        {
            return inp1.length();
        }else{
            return 0;
        }
    }

    public static void getPalindrome(String s)
    {
        int maxnum = 1;
        String palinStr = s.substring(0,1);
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                String substr = s.substring(i,j);
                int num = getPalindromeLength(substr);
                if(num>maxnum)
                {
                    maxnum = num;
                    palinStr = substr;
                }
            }
        }
        System.out.println(palinStr + " - " + maxnum);
    }

    public static void main(String[] args) {
        String s = "aaaabbaa";
        getPalindrome(s);
//        System.out.println(getPalindromeLength(s));
    }
}
