package Recursions;

public class GCD {

//    10, 50 => 10
    static int getSimpleGCD(int a, int b)
    {
        if(a == 0 && b == 0)
        {
            return 0;
        }

        if(a == 0)
        {
            return b;
        }

        if(b == 0)
        {
            return a;
        }

        if(a == b)
        {
            return a;
        }

        if(a>b) // 6,3
            return getSimpleGCD(a-b, b);
        return getSimpleGCD(a, b-a);
    }
}
