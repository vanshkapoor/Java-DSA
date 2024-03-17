package LLD.RideSharing;

public class Vehicle {
    String model;
    String numberPlate;

    Vehicle(String model, String numberPlate)
    {
        this.model = model;
        this.numberPlate = numberPlate;
    }

    public static Vehicle getVehicle(String model, String numberPlate)
    {
        return new Vehicle(model, numberPlate);
    }

}
