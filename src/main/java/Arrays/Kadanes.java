package Arrays;

public class Kadanes {
    public static void main(String[] args) {
        int arr[] = {-1,-2,4,-6,10,2,-1,3};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++)
        {
                sum+=arr[i];
                if(sum>max){
                    max = sum;
                }
                if(sum<0)
                {
                    sum=0;
                }
        }

        System.out.println(sum);


    }
}
