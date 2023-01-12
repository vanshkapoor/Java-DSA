package Arrays;
//      Input          Output
//        26             Z
//        51             AY
//        52             AZ
//        80             CB
//        676            YZ
//        702            ZZ
//        705            AAC

public class Excel {
    public static void main(String[] args) {
        int num = 51;
        getExcelCol(num);
    }

    private static void getExcelCol(int num) {
        String s = "";
        StringBuilder ss = new StringBuilder();
        while(num>0)
        {
            int rem = num%26;
            if(rem == 0)
            {
                ss.append("Z");
                num=(num/26)-1;
            }else{
                ss.append((char)((rem-1) + 'A'));
                num=num/26;
            }
        }
        System.out.println(ss);
    }
}
