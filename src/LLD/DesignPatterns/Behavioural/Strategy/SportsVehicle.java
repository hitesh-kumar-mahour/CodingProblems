package LLD.DesignPatterns.Behavioural.Strategy;

import LLD.DesignPatterns.Behavioural.Strategy.DriveStrategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
