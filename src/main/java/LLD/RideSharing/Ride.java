package LLD.RideSharing;

public class Ride {
    String id;
    String userName;
    String origin;
    Integer availableSeats;
    Vehicle vehicle;
    String destination;

    public Ride(String id, String userName, String origin, Integer availableSeats, Vehicle vehicle, String destination) {
        this.id = id;
        this.userName = userName;
        this.origin = origin;
        this.availableSeats = availableSeats;
        this.vehicle = vehicle;
        this.destination = destination;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }
}
