package Leetcode.OOPS.Abstraction;

public class Rectangle extends Shape {
    int len;
    int breadth;

    Rectangle(int len, int breadth)
    {
        this.len = len;
        this.breadth = breadth;
    }

    @Override
    public int getArea()
    {
        return 2*(len+breadth);
    }
}
