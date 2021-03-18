import javax.print.DocFlavor.STRING;

public class GameEnvironment {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

class GamePlayer {
    double width;
    double height;
    int positionX;
    int positionY;

    GamePlayer() {

    }

    GamePlayer(double width, double height) {
        this.width = width;
        this.height = height;
    }

    GamePlayer(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    int getX() {
        return this.positionX;
    }

    int getY() {
        return this.positionY;
    }

    void Run() {
        System.out.println("Player is running");
    }

    void Run(int incrementX) {
        this.positionX += incrementX;
        System.out.println("Player still running...current X position = " + this.positionX);
    }
}