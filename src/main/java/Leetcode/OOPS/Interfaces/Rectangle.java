package Leetcode.OOPS.Interfaces;

public class Rectangle extends ShapeClass{
    int len;
    int bre;

    Rectangle(int len, int breadth)
    {
        super(len*breadth);
        this.len = len;
        this.bre = breadth;
    }

    @Override
    public void displayArea()
    {
        super.displayArea();
        System.out.println("RECTANGLE AREA");
    }


}
