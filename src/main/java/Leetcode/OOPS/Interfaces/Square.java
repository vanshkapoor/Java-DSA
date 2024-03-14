package Leetcode.OOPS.Interfaces;

public class Square implements Shape {
    int side;
    public Square(int side)
    {
        this.side = side;
    }

    @Override
    public int getArea()
    {
        return this.side * 4;
    }
}
