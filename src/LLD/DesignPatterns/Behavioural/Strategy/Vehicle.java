package LLD.DesignPatterns.Behavioural.Strategy;

import LLD.DesignPatterns.Behavioural.Strategy.DriveStrategy.DriveStrategy;

public abstract class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public String myDrive() {
        return "Has " + this.driveStrategy.drive();
    }
}
