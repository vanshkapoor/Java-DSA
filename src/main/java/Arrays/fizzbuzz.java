package Arrays;
// {1,2,3,4,5,6,7,8,9,10,15}
// op => {1,2,fizz,4,buzz,6,7,8,9,buzz,fizzbuzz}

public class fizzbuzz {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int c3=0;
        int c5=0;
        String s="";

        for(int i=0;i< arr.length; i++)
        {
            c3++;
            c5++;
            if(c3 == 3)
            {
                s+="fizz";
                c3=0;
            }
            if(c5==5)
            {
                s+="buzz";
                c5=0;
            }
            if(s.isEmpty())
            {
                System.out.println(i);
            }else{
                System.out.println(s);
                s="";
            }

        }
    }
}
