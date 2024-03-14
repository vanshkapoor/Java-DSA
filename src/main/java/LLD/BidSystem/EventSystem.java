package LLD.BidSystem;

import java.util.ArrayList;
import java.util.Date;

public class EventSystem {
    ArrayList<Events> eventsList;

    EventSystem()
    {
        eventsList = new ArrayList<Events>();
    }

    public Events createEvent(int eventId, String eventName, String prize, String createdAt)
    {

        for(Events event: eventsList)
        {
            if(event.eventName.equals(eventName)){
                System.out.println("Event with this name already exists.");
                return null;
            }
            if(event.createdAt == createdAt){
                System.out.println("Can not create more than 1 event in a day.");
                return null;
            }
        }

        Events event = Events.createEvent(eventId, eventName, prize, createdAt);
//        if(eventsList.contains(event)){
//        }
        eventsList.add(event);
        MemberEventRegistration.addEvent(eventId);
        System.out.println("Event created!");
        return event;
    }

    public void registerMember(Integer userId, Integer eventId)
    {
        MemberEventRegistration.registerMember(userId, eventId);
    }

    public boolean validateIfUserRegistered(Integer userId, Integer eventId)
    {
        return MemberEventRegistration.validateIfMemberRegistered(userId, eventId);
    }



}
