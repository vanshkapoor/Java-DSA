package Leetcode.OOPS.Abstraction;

abstract public class Shape {
    abstract public int getArea();

    private void instantiate(){
        System.out.println("Instantiated.");
    }
}
