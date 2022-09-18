package Recursions;

public class Check {
    public static void main(String[] args) {
        fn(5);
    }

    private static int fn(int i) {
        if(i==0)
        {
            return i;
        }
        System.out.println("first - "+ i);
        fn(i-1);
        System.out.println("last - "+ i);
        return 0;
    }
}
