package LLD.BidSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MemberEventRegistration {
    static HashMap<Integer, ArrayList<Integer>> MemberEventRegistrations = new HashMap<Integer, ArrayList<Integer>>();;


    static void addEvent(Integer eventId)
    {
        MemberEventRegistrations.put(eventId, new ArrayList<Integer>());
    }

    static void registerMember(Integer userId, Integer eventId)
    {
        ArrayList<Integer> users = MemberEventRegistrations.get(eventId);
        for(int ids: users)
        {
            if(ids == userId)
            {
                System.out.println("User alread registered");
                return;
            }
        }
        users.add(userId);
        MemberEventRegistrations.put(eventId, users);
        System.out.println("Registered to the event");
    }

    static boolean validateIfMemberRegistered(Integer userId, Integer eventId)
    {
        ArrayList<Integer> users = MemberEventRegistrations.get(eventId);
        for(int uid: users)
        {
            if(uid == userId) return true;
        }
        return false;
    }
}



