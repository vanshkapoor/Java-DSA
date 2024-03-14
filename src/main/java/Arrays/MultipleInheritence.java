package Arrays;


interface base {
    default void display(){
        System.out.println("DEFAULTTTT");
    }
}


interface parent1 extends base {
    @Override
    default void display() {
        System.out.println("PARENTTTT --- 1");
    }
}

interface parent2 extends base {
    @Override
    default void display() {
        base.super.display();
        System.out.println("PARENTTTT --- 2");
    }
}

public class MultipleInheritence implements parent1, parent2 {

    public static void main(String[] args) {
        MultipleInheritence obj = new MultipleInheritence();
        obj.display();
    }

    @Override
    public void display() {
        parent1.super.display();
        parent2.super.display();
    }
}
