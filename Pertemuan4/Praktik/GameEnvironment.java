import java.lang.Math;
import java.util.*;

class GameEnvironment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment() {
    }

    public GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void addPlayer(GamePlayer player) {
        this.arrPlayer.add(player);
    }

    public void removePlayer(GamePlayer player) {
        this.arrPlayer.remove(player);
    }

    public void getAllPlayer() {
        for (int i = 0; i < arrPlayer.size(); i++) {
            System.out.println(arrPlayer.get(i));
        }
    }

    public void addEnemy(GameEnemy enemy) {
        this.arrEnemy.add(enemy);
    }

    public void removeEnemy(GameEnemy enemy) {
        this.arrEnemy.remove(enemy);
    }

    public void getAllEnemies() {
        for (int i = 0; i < this.arrEnemy.size(); i++) {
            System.out.println(this.arrEnemy.get(i));
        }
    }

    public void Interaction() {
        if (arrPlayer.size() == 0 || arrEnemy.size() == 0) {
            System.out.println("Player or enemy not Sets");
        }
        for (int i = 0; i < arrPlayer.size(); i++) {
            for (int j = 0; j < arrEnemy.size(); j++) {
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j)
                            + " not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(),
                        arrEnemy.get(j).getY()) < 2) {
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                } else {
                    System.out.println("==> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).Run((int) Math.ceil(Math.random() * 10));
                    System.out.println("current x position = " + arrPlayer.get(i).getX() + " <==");
                }
            }
        }
    }

    int EuclideanDistance(int x1, int y1, int x2, int y2) {

        return (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}