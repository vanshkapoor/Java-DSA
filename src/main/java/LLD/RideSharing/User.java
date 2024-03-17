package LLD.RideSharing;

import java.util.ArrayList;

public class User {
    String name;
    String gender;
    int age;

    User(String name, String gender, int age)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static User addUser(String name, String gender, int age)
    {
        return new User(name, gender, age);
    }
}
