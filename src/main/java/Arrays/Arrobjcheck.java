package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrobjcheck {
    List<ArrayObj> obj;

    public Arrobjcheck() {
        this.obj = new ArrayList<ArrayObj>();
    }

    public void show()
    {
        for(ArrayObj i: obj)
        {
            System.out.println(i.name + " - " + i.id);
        }
    }

    public void removeArrayObj(ArrayObj obj)
    {
        this.obj.remove(obj);
    }

    public void removeArrayObjFromString(String num)
    {
        for(ArrayObj i: this.obj)
        {
            if(i.name == num)
            {
                this.obj.remove(i);
            }
        }
    }

    public void addArrayObj(ArrayObj obj)
    {
        this.obj.add(obj);
    }




    public static void main(String[] args) {
        Arrobjcheck ob = new Arrobjcheck();
        ArrayObj one = new ArrayObj("one", 1);
        ArrayObj two = new ArrayObj("two", 2);

        ob.addArrayObj(one);
        ob.addArrayObj(two);

        ob.show();

        ob.removeArrayObjFromString("one");

        ob.show();
    }
}
