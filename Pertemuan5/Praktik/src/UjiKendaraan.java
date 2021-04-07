package src;

public class UjiKendaraan {
    public static void main(String[] args) {
        MotorVehicle motorku = new MotorVehicle(4, "H 311 O");
        System.out.println("Motorku : ");
        System.out.println("Engine size : " + motorku.getsizeofEngine());
        System.out.println("Plat Nomor : " + motorku.getLicencePlate());
        motorku.goStraight();

        System.out.println("");

        System.out.println("Pitku: ");
        Bicycle pitku = new Bicycle();
        pitku.turnLeft();
        pitku.turnRight();
        pitku.ringBell();
    }
}