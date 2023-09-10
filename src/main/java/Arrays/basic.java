package Arrays;


import java.util.ArrayList;

public class basic {
    private String name;
    private int id;

    public basic(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(8);
        arr.add(5);

        System.out.println(arr.contains(2));


        arr.remove(2);


        for(int i: arr)
        {
            System.out.println(i);
        }













    }
}
