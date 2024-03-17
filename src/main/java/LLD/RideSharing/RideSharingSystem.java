package LLD.RideSharing;

public class RideSharingSystem {

    public static void main(String[] args) {
        User u1 = User.addUser("Rohan", "M", 36);
        Vehicle v1 = UserVehicle.addVehicle(u1.name, "Swift", "KA-01-12345");
        User u2 = User.addUser("Shashank", "M", 29);
        Vehicle v2 = UserVehicle.addVehicle(u2.name, "Baleno", "TS-05-62395");
        User u3 = User.addUser("Nandini", "F", 29);
        User u4 = User.addUser("Shipra", "F", 27);
        Vehicle v3 = UserVehicle.addVehicle(u4.name, "Polo", "KA-05-41491");
        Vehicle v4 = UserVehicle.addVehicle(u4.name, "Activa", "KA-12-12332");
        User u5 = User.addUser("Gaurav", "M", 29);
        User u6 = User.addUser("Rahul", "M", 35);
        Vehicle v5 = UserVehicle.addVehicle(u6.name, "XUV", " KA-05-1234");

        RideManagement.offerRide("2a", u1.name, "Hyderabad", 1, v1, "Bangalore");
        RideManagement.offerRide("2b", u4.name, "Bangalore", 1, v4, "Mysore");
        RideManagement.offerRide("2c", u4.name, "Bangalore", 2, v3, "Mysore");
        RideManagement.offerRide("2d", u2.name, "Hyderabad", 2, v2, "Bangalore");
        RideManagement.offerRide("2e", u6.name, "Hyderabad", 5, v5, "Bangalore");
        RideManagement.offerRide("2f", u1.name, "Bangalore", 1, v1, "Pune");
//        RideManagement.printAllRidesOffered();


        RideManagement.selectRide(u3.name, "Bangalore", "Mysore", 1, "Most Vacant");
        RideManagement.selectRide(u5.name, "Bangalore", "Mysore", 1, "Preferred Vehicle=Activa");
        RideManagement.selectRide(u2.name, "Mumbai", "Bangalore", 1, "Most Vacant");
        RideManagement.selectRide(u1.name, "Hyderabad", "Bangalore", 1, "Preferred Vehicle=Baleno");
        RideManagement.selectRide(u2.name, "Hyderabad", "Bangalore", 1, "Preferred Vehicle=Polo");

        RideManagement.endRide("2-a");
        RideManagement.endRide("2-b");
        RideManagement.endRide("2-c");
        RideManagement.endRide("2-d");

        RideManagement.printStats();


    }
}
