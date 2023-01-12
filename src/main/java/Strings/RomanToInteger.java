package Strings;

public class RomanToInteger {

    public static int getValue(Character ch)
    {
        int num=0;
        switch (ch)
        {
            case 'I': num=1;break;
            case 'V': num=5;break;
            case 'L': num=50;break;
            case 'X': num=10;break;
            case 'M': num=1000;break;
            case 'C': num=100;break;
            case 'D': num=500;break;
        }
        return num;
    }

    public static void romanToDecimal(String str)
    {
        int len = str.length();
        int totalvalue = 0;
        if(len==1)
        {
            totalvalue=getValue(str.charAt(0));
        }

        totalvalue+=getValue((str.charAt(len-1)));

        for(int i=len-2;i>=0;i--)
        {
            int l1 = getValue(str.charAt(i));
            int l2 = getValue(str.charAt(i+1));

            if(l1>=l2)
            {
                totalvalue = totalvalue+(l1);
            }else{
                totalvalue = totalvalue-l1;
            }
        }
        System.out.println(totalvalue);
    }

    public static void main(String[] args) {
        String str = "CDXCIII"; //CDXCIII
        romanToDecimal(str);
//        System.out.println(getValue(str.charAt(0)));


    }
}
