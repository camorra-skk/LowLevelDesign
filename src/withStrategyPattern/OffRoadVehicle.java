package src.withStrategyPattern;

import src.withStrategyPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
