package GFG.Strings;

public class Basics {
    String s;

    public Basics(String s) {
        this.s = s;
    }

    public void reverse(){
        String S = "abbaa";
        String[] arr = {"as", "asd", "re"};
        System.out.println(arr.length);
        Integer.parseInt("122");

    }

    public boolean ipvalid()
    {
        // Write your code here
        String s="0000.0000.0000.0000";
        String[] iparr = s.split("\\.");
        if(iparr.length!=4){
            return false;
        }
        for(String num:iparr)
        {
            if(num == ""){
                System.out.println("num");
            }
            int i = Integer.parseInt(num);
            System.out.println(i);
            if(i>255 || i<0)
            {
                return false;
            }
        }
        return true;
    }

    public static String swap(String str, int i, int j)
    {
        if (j == str.length() - 1)
            return str.substring(0, i) + str.charAt(j)
                    + str.substring(i + 1, j) + str.charAt(i);

        return str.substring(0, i) + str.charAt(j)
                + str.substring(i + 1, j) + str.charAt(i)
                + str.substring(j + 1, str.length());

    }

    public static void isRotatedBy2Places()
    {
        String str2 = "amazon"; //6, (4,6)
        String ls = "azonam";
        String rs = "onamaz";

        String nls = str2.substring(2, str2.length()) + str2.substring(0,2);
        String nrs = str2.substring(str2.length()-2, str2.length()) + str2.substring(0,str2.length()-2);

        if(nls == ls || nrs == ls)
        {
            System.out.println("equal");
        }

    }

    public static void main(String[] args) {
//        Basics obj = new Basics("test");
//        obj.reverse();
//        System.out.println(obj.ipvalid());

//        System.out.println(swap("vansh", 0, 4));
        isRotatedBy2Places();
    }
}
