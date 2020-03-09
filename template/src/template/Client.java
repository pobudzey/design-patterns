package template;

public class Client {

    public static void main(String[] args) {
        Game cricketGame = new CricketGame();
        cricketGame.play();
        Game footballGame = new FootballGame();
        footballGame.play();
    }
}
