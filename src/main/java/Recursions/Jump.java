package Recursions;

public class Jump {

    static int cnt=0;

    public static void climber(int n)
    {
        if(n==0)
        {
            cnt++;
            return;
        }
        if(n<0)
        {
            return;
        }

        climber(n-1);
        climber(n-2);
    }

    public int climbStairs(int n) {
        climber(n);
        return cnt;
    }

    public static void main(String[] args) {
        Jump obj = new Jump();
        System.out.println(obj.climbStairs(3));
    }
}
