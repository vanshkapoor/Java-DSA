package LLD.BidSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Events {
    int eventId;
    String eventName;
    String prize;
    String createdAt;

    Events(int eventId, String eventName, String prize, String createdAt)
    {
        this.eventId = eventId;
        this.eventName = eventName;
        this.prize = prize;
        this.createdAt = createdAt;
    }

    public static Events createEvent(int eventId, String eventName, String prize, String createdAt)
    {
        Events obj = new Events(eventId, eventName, prize, createdAt);
        return obj;
    }

}
