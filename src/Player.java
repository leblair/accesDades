public class Player {
    String playerName;
    int playerPoint;

    public Player(String playerName, int playerPoint) {
        this.playerName = playerName;
        this.playerPoint = playerPoint;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }

    @Override
    public String toString() {
        return playerName + "    " + playerPoint;
    }
}
