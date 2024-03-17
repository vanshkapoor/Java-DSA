package LLD.RideSharing;

import java.util.ArrayList;
import java.util.HashMap;

public class RideManagement {
    static ArrayList<Ride> allOfferedRides = new ArrayList<Ride>();
    static ArrayList<BookedRide> allBookedRides = new ArrayList<BookedRide>();

    private static boolean isValidRide(String userName, String numberPlate)
    {
        for(Ride ride: allOfferedRides)
        {
            if(ride.userName == userName && ride.vehicle.numberPlate == numberPlate)
            {
                return false;
            }
        }
        return true;
    }

    public static void printAllRidesOffered()
    {
        for(Ride ride: allOfferedRides)
        {
           System.out.println("RIDE DETAILS ---" + ride.id);
        }
    }

    public static void offerRide(String id, String userName, String origin, Integer availableSeats, Vehicle vehicle, String destination)
    {
        if(!isValidRide(userName, vehicle.numberPlate)) {
            System.out.println("Ride already offered for " + userName + " - " + id);
            return;
        }


        Ride ride = new Ride(id, userName, origin, availableSeats, vehicle, destination);
        allOfferedRides.add(ride);
    }

    private static Ride getVacantRides(String origin, String destination)
    {
        Ride finalRide = null;
        int maxVacantSeats = 0;
        for(Ride ride: allOfferedRides)
        {
            if(ride.origin == origin && ride.destination == destination && ride.availableSeats > maxVacantSeats)
            {
                maxVacantSeats = ride.availableSeats;
                finalRide = ride;
            }
        }

        return finalRide;
    }

    private static Ride getVehicleFilteredRide(String origin, String destination, String vehicleModel) {
//        Ride finalRide = null;
        for(Ride ride: allOfferedRides)
        {
            if(ride.origin == origin && ride.destination == destination && ride.vehicle.model.equals(vehicleModel))
            {
                return ride;
            }
        }
        return null;
    }

    public static void selectRide(String riderName, String origin, String destination, int seats, String filter)
    {
        Ride ride = null;
        if(filter == "Most Vacant")
        {
            ride = getVacantRides(origin, destination);
        }
        else{
            ride = getVehicleFilteredRide(origin, destination, filter.split("=")[1]);
        }

        if(ride == null)
        {
            System.out.println("No rides found");
            return;
        }

//        book the ride
        ride.setAvailableSeats(ride.availableSeats-1);
        allBookedRides.add(new BookedRide(ride, riderName));
        System.out.println("Booked ride for " + riderName + " with id -" + ride.id);
    }

    public static void endRide(String rideId)
    {
        for(BookedRide bookedRide: allBookedRides)
        {
            if(bookedRide.ride.id == rideId)
            {
                bookedRide.setStatus("Ended");
            }
        }
    }

    public static void printStats()
    {
        HashMap<String, ArrayList<Integer>> userRideMap = new HashMap<String, ArrayList<Integer>>();

        for(Ride ride: allOfferedRides)
        {
            if(userRideMap.get(ride.userName) == null)
            {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(1);
                arr.add(0);
                userRideMap.put(ride.userName, arr);
            }else{
                ArrayList<Integer> arr = userRideMap.get(ride.userName);
                arr.set(0, arr.get(0)+1);
                userRideMap.put(ride.userName, arr);
            }
        }

        for(BookedRide ride: allBookedRides)
        {
            if(userRideMap.get(ride.riderName) == null)
            {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(0);
                arr.add(1);
                userRideMap.put(ride.riderName, arr);
            }else{
                ArrayList<Integer> arr = userRideMap.get(ride.riderName);
                arr.set(1, arr.get(1)+1);
                userRideMap.put(ride.riderName, arr);
            }
        }

    }

}
