import models.Player;

public class Game {
    private GameEngine gameEngine;

    public Game(String player1Name, String player2Name) {
        Player p1 = new Player(player1Name);
        Player p2 = new Player(player2Name);

        this.gameEngine = new GameEngine(p1, p2);
    }


    public void wonPoint(String playerName ){
        try {
            this.gameEngine.increaseScoreForPlayerWithName(playerName);
        } catch (Exception e) {
            System.err.println("COULD NOT FIND PLAYER");
        }
    }

    public void getScore() {
        System.out.println(this.gameEngine.getScore());
    }




}
