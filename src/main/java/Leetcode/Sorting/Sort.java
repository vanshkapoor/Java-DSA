package src.main.java.Leetcode.Sorting;

// 1. selection sort - DONE
// 2. bubble sort - DONE
// 3. merge sort
// 4. insertion sort
// 5. quick sort
// 6. heap sort


public class Sort {
    int[] arr;

    Sort(int[] arr)
    {
        this.arr = arr;
    }
    public void display()
    {
        for(int i: arr)
        {
            System.out.println(i + "-");
        }
    }

    public void selectionSort(){
        int len = arr.length;
        for(int i=0; i<len-1; i++)
        {
            int min=i;
            for(int j=i+1; j<len; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public void bubbleSort(){
        int len = arr.length;
        for(int i=0;i<len-1;i++)
        {
            boolean swapped = false;
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }

    }



    public static void main(String[] args) {
        int arr[] = {7,1,2,0,4,5,3};
//        Sort selection = new Sort(arr);
//        selection.selectionSort();
//        selection.display();

        Sort bubble = new Sort(arr);
        bubble.bubbleSort();
        bubble.display();


    }
}
