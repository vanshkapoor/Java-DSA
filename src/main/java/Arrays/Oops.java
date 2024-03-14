package Arrays;

public class Oops {
    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }

    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String[] args) {
        Oops op1 = new Oops();
        op1.set("s1", 23232);
        op1.get();

        Oops op2 = new Oops();
        op2.get();

//        Oops.set("s1", 23232);
//        Oops.get();
        Oops.set("s2", 9898);
        Oops.get();

        op1.get();

    }
}
