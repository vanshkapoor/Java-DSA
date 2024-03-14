package Leetcode.OOPS.Interfaces;

public class ShapeClass {
    int area;

    ShapeClass(int area)
    {
        this.area = area;
    }

    public int getArea()
    {
        return this.area;
    }

    public void displayArea()
    {
        System.out.println("SHAPE CLASS");
    }
}
