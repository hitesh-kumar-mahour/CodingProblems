package LLD.DesignPatterns.Behavioural.Strategy;

public class Simulator {
    public static void main(String[] args) {
        Vehicle v = new SportsVehicle();
        System.out.println(v.myDrive());
    }
}
