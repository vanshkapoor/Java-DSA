package LLD.RideSharing;

import java.util.ArrayList;
import java.util.HashMap;

public class UserVehicle {
    static HashMap<String, ArrayList<Vehicle>> userVehicleList = new HashMap<String, ArrayList<Vehicle>>();


    private static boolean validateUserVehicle(String username, String numberPlate)
    {
        ArrayList<Vehicle> userVehicles = userVehicleList.get(username);

        if(userVehicles == null)
        {
            return true;
        }

        for(Vehicle obj: userVehicles)
        {
            if(obj.numberPlate == numberPlate)
            {
                return false;
            }
        }

        return true;
    }

    public static Vehicle addVehicle(String username, String model, String numberPlate)
    {
        Vehicle vehicle = Vehicle.getVehicle(model, numberPlate);

        if(!validateUserVehicle(username, numberPlate)){
            System.out.println("Vehicle already added");
            return null;
        }
        ArrayList<Vehicle> userVehicles = userVehicleList.get(username);
        if(userVehicles == null)
        {
            ArrayList<Vehicle> newVehicleList = new ArrayList<Vehicle>();
            newVehicleList.add(vehicle);
            userVehicles = newVehicleList;
        }else{
            userVehicles.add(vehicle);
        }
        userVehicleList.put(username, userVehicles);
        System.out.println(numberPlate + " - Vehicle added for " + username);
        return vehicle;
    }
}
