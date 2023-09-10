package Arrays;

public class Equilibrium {
    public static void main(String[] args) {
        long arr[] = {1,3,5,2,2};
        int n=arr.length;
        long sumArr[] = new long[n];


//        if(n==0)
//        {
//            return -1;
//        }
//
//        if(n==1)
//        {
//            return 1;
//        }

        int sum = 0;
        int index=0;
        for(long i: arr)
        {
            sum+=i;
            sumArr[index] = sum;
            index++;
        }

        int equiIndex=-1;



        for(int i=1;i<n;i++)
        {
            long lsum = sumArr[i-1];
            long rsum = sum - sumArr[i];
            if(lsum == rsum)
            {
                equiIndex = i+1;
            }

        }

        System.out.println(equiIndex);


    }
}
