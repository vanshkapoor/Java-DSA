package Arrays;


interface baselayer {
    String captain = "Captain";
    void getPlayers();
    int getPlayerNumber(String playerName);
}

class Team implements baselayer {

    @Override
    public void getPlayers() {
        System.out.println("playersss" + captain);
    }

    @Override
    public int getPlayerNumber(String playerName) {
        return 0;
    }
}

public class InterFC{
    public static void main(String[] args) {
        Team FCbarca = new Team();
        FCbarca.getPlayers();
        System.out.println(FCbarca.getPlayerNumber("p1"));
    }

}
