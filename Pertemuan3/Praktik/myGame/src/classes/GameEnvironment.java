package classes;

public class GameEnvironment {
    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer(10, 15, 20, 25);
        player1.Run();
        player1.Run(30);
        GameEnemy enemy1 = new GameEnemy(10, 15, 20, 25);
        enemy1.Run();
    }
}
