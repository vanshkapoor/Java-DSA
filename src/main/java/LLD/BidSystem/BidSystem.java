package LLD.BidSystem;

import java.util.Date;

public class BidSystem {

    public static void main(String[] args) {
        User user1 = new User(1, "Akshay", 10000);
        User user2 = new User(2, "Chris", 5000);

        EventSystem eventSystem = new EventSystem();
        Events event1 = eventSystem.createEvent( 1, "BBD" ,"IPHONE-14", "2023-06-06");
        eventSystem.registerMember(user1.userId, event1.eventId);

        EventBids eventbids = new EventBids();
//      submit bid
        eventbids.submitBids(event1.eventId, user1, new int[]{100, 200, 400, 500, 600});
//      declare winner
        eventbids.declareWinner(event1.eventId);
    }
}
