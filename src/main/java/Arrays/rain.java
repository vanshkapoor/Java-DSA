package Arrays;

public class rain {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3};
        System.out.println(getTotalWaterFilledByRain(arr, arr.length));
    }

    private static int getTotalWaterFilledByRain(int[] arr, int length) {
        int totalwater = 0;
        int pos=1;
        for(int i=0;i<length;i+=pos)
        {
            int nextmax=arr[i];
            pos=i;
            for(int j=i+1;j<length;j++)
            {
                if(arr[j]>arr[i])
                {
                    nextmax=arr[j];
                    pos=j;
//                    System.out.println("pos = " + pos);
                    break;
                }
            }
            System.out.println(pos+ "-" + i);
            int dist=pos-i-1;
            int maxheight = Math.min(arr[i], nextmax);
            int maxWater = maxheight*dist;
            int tosubtractheights = 0;
            for(int k=i;k<pos;k++)
            {
                tosubtractheights+=arr[k];
                System.out.println("tosubtractheights = " + tosubtractheights);

            }
            maxWater=maxWater-tosubtractheights; //0 - 1 -
            totalwater+=maxWater;
            System.out.println("maxWater - " +maxWater);

        }
        return totalwater;
    }
}
