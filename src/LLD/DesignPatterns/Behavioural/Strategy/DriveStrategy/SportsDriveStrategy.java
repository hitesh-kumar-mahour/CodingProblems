package LLD.DesignPatterns.Behavioural.Strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public String drive() {
        return "sports driving";
    }
}
