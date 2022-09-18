package Recursions;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        powerset(str, "", 0, str.length());
    }

    private static void powerset(String str, String curr, int i, int n) {
        if(i==n)
        {
            System.out.println(curr);
            return;
        }

        powerset(str, curr+str.charAt(i), i+1, n);
        powerset(str, curr, i+1, n);

    }
}
