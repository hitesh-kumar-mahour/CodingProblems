package LLD.DesignPatterns.Behavioural.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public String drive() {
        return "normal driving";
    }
}
