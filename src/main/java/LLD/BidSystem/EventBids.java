package LLD.BidSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class EventBids {
    HashMap<Integer, ArrayList<UserBids>> eventsBid = new HashMap<Integer, ArrayList<UserBids>>();

    public void submitBids(int eventId, User user, int[] bids)
    {
        if(!user.isValidBid(bids)) return;
        if(!MemberEventRegistration.validateIfMemberRegistered(user.userId, eventId)) return;

        ArrayList<UserBids> allUserBids = eventsBid.get(eventId);

        if(allUserBids!=null)
        {
            for(UserBids ub: allUserBids)
            {
                if(ub.user.userId == user.userId)
                {
                    System.out.println("User has alread submitted the bid");
                    return;
                }
            }
        }


        UserBids userBid = new UserBids(user, bids);
        user.updateWallet(bids);

        if(allUserBids!=null)
        {
            allUserBids.add(userBid);
            eventsBid.put(eventId, allUserBids);
        }else{
            ArrayList<UserBids> usersEventBid = new ArrayList<>();
            usersEventBid.add(userBid);
            eventsBid.put(eventId, usersEventBid);
        }
    }

    public void declareWinner(int eventId)
    {
        ArrayList<UserBids> allUserBids = eventsBid.get(eventId);

        UserBids winnerBid=null;
        Integer minBid = Integer.MAX_VALUE;

        for(int i=allUserBids.size()-1; i>=0; i--)
        {
            Integer cmin = minBid;
            for(int b: allUserBids.get(i).bids)
            {
                minBid = Math.min(minBid, b);
            }
            if(minBid<cmin)
            {
                winnerBid = allUserBids.get(i);
            }
        }
        if(winnerBid!=null)
        {
            System.out.println("WINNER is" + winnerBid.user.name);
        }

    }
}
