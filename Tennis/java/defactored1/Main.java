public class Main {
    public static void main(String[] args) {

        String player1 = "Player1";
        String player2 = "Player2";

        Game g = new Game(player1, player2);

        g.wonPoint(player1);
        g.getScore();

    }
}
