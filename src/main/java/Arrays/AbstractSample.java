package Arrays;

abstract class Base {
    Base(){
        System.out.println("ABstrract class constructor ");
    }
    void display() {
        System.out.println("displayy");
    }
    abstract void displayHighest();
}

class Child extends Base {
    @Override
    void displayHighest() {
        System.out.println("Child highest");
    }

    void childName(){
        System.out.println("Child Nameee");
    }
}


class One {
    public void One(){
        System.out.println("Onee");
    }
}

class Two extends One {
    public void Two(){
        System.out.println("Twoo");
    }
}

public class AbstractSample extends Base {
    @Override
    void displayHighest() {
        System.out.println("Abstract highest");
    }

    public static void main(String[] args) {
        Child ob = new Child();
        ob.displayHighest();

        Base obb = new Base() {
            @Override
            void displayHighest() {

            }
        };


        Base cb = new Child();
//        cb.childName();   // ************ This doesn't work in case of abstract classes!!!
        ob.childName();



        One n = new Two();
//        n.Two();
        Two t = new Two();
        t.Two();

    }
}
