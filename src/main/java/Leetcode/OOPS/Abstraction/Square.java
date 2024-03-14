package Leetcode.OOPS.Abstraction;

public class Square extends Shape {
    private int side;
    public Square(int side)
    {
        this.side = side;
//        this.instantiate(); NOT INHERITED
    }
    @Override
    public int getArea()
    {
        return 4 * side;
    }
}
