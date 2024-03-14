package LLD.BidSystem;

public class User {
    int userId;
    String name;
    int points;
    User(int userId, String name, int points)
    {
        this.userId = userId;
        this.name = name;
        this.points = points;
    }
    User(){}

    public User addMember(int userId, String name, int points)
    {
        return new User(userId, name, points);
    }

    public boolean isValidBid(int[] bids)
    {
        if(bids.length>5) return false;
        int maxBid = 0;
        for(int i: bids)
        {
            maxBid = Math.max(maxBid, i);
        }
        if(maxBid>points)
        {
            System.out.println("User doesn't have enough points");
            return false;
        }
        return true;
    }

    public void updateWallet(int[] bids)
    {
        if(bids.length>5) return;
        int maxBid = 0;
        for(int i: bids)
        {
            maxBid = Math.max(maxBid, i);
        }
        if(maxBid>points)
        {
            System.out.println("User doesn't have enough points");
            return;
        }
        this.points-=maxBid;
    }



//    public void submitBid(Events eventId, int[] bids)
//    {
////        validate if user has registered
//
////        Validate bids
//    }
}
