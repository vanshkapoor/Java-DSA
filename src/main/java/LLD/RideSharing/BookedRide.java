package LLD.RideSharing;

import java.util.ArrayList;

public class BookedRide {
    Ride ride;
    String status;
    String riderName;
    public BookedRide(Ride ride, String riderName) {
        this.ride = ride;
        status = "booked";
        this.riderName = riderName;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
