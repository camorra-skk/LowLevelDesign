package src.withStrategyPattern;

import src.withStrategyPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
