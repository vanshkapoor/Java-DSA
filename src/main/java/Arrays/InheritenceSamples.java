package Arrays;

class Inhbase {
    void display(){
        System.out.println("BASSSEEEEEE");
    }
}

class ChildBase1 extends Inhbase {
    @Override
    void display() {
        super.display();
    }
}

class ChildBase2 extends Inhbase {
    @Override
    void display() {
        super.display();
    }
}

public class InheritenceSamples {
    public static void main(String[] args) {
        ChildBase1 cb = new ChildBase1();
        ChildBase2 cb2 = new ChildBase2();
        cb.display();

        cb.equals(cb2);
    }
}
