package Recursions;

public class Number {
    static int numb=0;
//    400 => 40 -> 4 -> 0
    int getNumberLength(int num)
    {
        if(num<=0)
        {
            return 0;
        }

        return 1+getNumberLength(num/10);
    }

    int getSumOfNumbers(int num)
    {
        if(num<=0)
        {
            return 0;
        }

        return num%10 + getSumOfNumbers(num/10);
    }

//    11 => 1011
    void decimalToBinary(int num)
    {
        if(num == 0)
        {
            return;
        }

        int binary = num%2;
        decimalToBinary(num/2);
        System.out.println(binary);
        numb = numb*10 + binary;
    }


    public static void main(String[] args) {
        Number obj = new Number();
        System.out.println(obj.getNumberLength(400));

        System.out.println(obj.getSumOfNumbers(400));

        obj.decimalToBinary(11);
        System.out.println(numb);

    }
}
