package Arrays;

import java.util.ArrayList;
import java.util.Stack;

public class LeaderInArr {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length-1;

        ArrayList<Integer> leaders = new ArrayList<>();
        int currIndex = 0;

        for(int i: arr)
        {
            if(leaders.isEmpty())
            {
                leaders.add(i);
                currIndex++;
            }
            else if (i<leaders.get(currIndex-1))
            {
                leaders.add(i);
                currIndex++;
            }
            else{
                while (!leaders.isEmpty() && i > leaders.get(currIndex-1))
                {
                    leaders.remove(currIndex-1);
                    currIndex--;
                }
                leaders.add(i);
                currIndex++;
            }
        }

        System.out.println(leaders);
    }
}
