import models.Player;

import java.util.Map;

public class GameEngine {

    private Player p1;
    private Player p2;

    public GameEngine(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public void increaseScoreForPlayerWithName(String name) throws Exception {
        if (p1.getName().equals(name)) {
            p1.increaseScore();
        } else if (p2.getName().equals(name)) {
            p2.increaseScore();
        } else {
            throw new Exception("Player not found!");
        }
    }



    private String getStringifiedScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }

    public String getScore() {
        if (this.p1.getScore() >= 3 && this.p2.getScore() >= 3 && this.p1.getScore() == this.p2.getScore()) {
            return "Deuce";
        } else if (this.p1.getScore() >= 3 && this.p2.getScore() >= 3 && (this.p1.getScore() - this.p2.getScore() >= 1 || this.p2.getScore() - this.p1.getScore() >= 1)) {
            return "Advantage";
        } else {
            return getStringifiedScore(this.p1.getScore()) + " - " + getStringifiedScore(this.p2.getScore());
        }



    }
}
