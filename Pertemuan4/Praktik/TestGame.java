public class TestGame {
    public static void main(String[] args) {
        GamePlayer pahlawan = new GamePlayer();
        pahlawan.setDimension(15, 15);
        pahlawan.setPosition(10, 220);
        System.out.println("Posisi Player: " + pahlawan.getX() + ", " + pahlawan.getY());
        pahlawan.Run(12);
        System.out.println("Posisi Player: " + pahlawan.getX() + ", " + pahlawan.getY());
        GamePlayer pahlawan2 = new GamePlayer();
        pahlawan2.setDimension(12, 32);
        pahlawan2.setPosition(10, 10);

        GameEnemy lubu = new GameEnemy();
        lubu.setDimension(12, 32);
        lubu.setPosition(10, 10);

        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(pahlawan);
        scene.addPlayer(pahlawan);
        scene.addPlayer(pahlawan2);
        scene.getAllPlayer();
        scene.removePlayer(pahlawan);
        scene.getAllPlayer();
        scene.addEnemy(lubu);
        scene.Interaction();
    }
}
