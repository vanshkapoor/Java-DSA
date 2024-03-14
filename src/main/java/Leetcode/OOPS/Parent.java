package Leetcode.OOPS;

abstract class basic {
    void display(){
        System.out.println("ABSTRACT CLASS");
    }
}

class BigParent {
    private String name;
    BigParent(String d)
    {
        name = d;
    }

    void display(){
        System.out.println("BIG PARENT CLASS");
    }
}

class Child extends BigParent {
    private String childName;

    Child(String ch)
    {
        super(ch);
        childName = ch;
    }

    @Override
    void display() {
        super.display();
        System.out.println("CHILD DISPLAY");
    }

    void onlyChild()
    {
        System.out.println("ONLY CHILD");
    }
}
public class Parent {
    public static void main(String[] args) {
        BigParent bop = new Child("vansh");
        bop.display();

        Child obj = new Child("vansh");
        obj.display();
        obj.onlyChild();

        BigParent bp = new BigParent("BP");
    }
}
