package Strings;

public class Rotation {
    
  
    public static void main(String[] args) {
        String s = "This string to be rotated";
        int cnt = 2;
        System.out.println(rotate(s, cnt));
    }

    private static String rotate(String s, int cnt) {
        while (cnt>0)
        {
            s = singleRotate(s);
            cnt--;
        }
        return s;
    }

    private static String singleRotate(String s) {
        String ns="";
        for(int i=1;i<s.length();i++)
        {
            ns+=s.charAt(i);
        }
        ns+=s.charAt(0);
        return ns;
    }
}
