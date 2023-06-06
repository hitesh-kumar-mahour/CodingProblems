package LLD.DesignPatterns.Behavioural.Strategy.DriveStrategy;

public class OffRoadDriveStrategy implements DriveStrategy {
    @Override
    public String drive() {
        return "off-road driving";
    }
}
