package Arrays;

public class Duplicate {
    public static void main(String[] args) {

        int arr[] = {2,6,4,1,3,1,5};

        int slow = 0, fast=0;

        do
        {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);


    }
}
