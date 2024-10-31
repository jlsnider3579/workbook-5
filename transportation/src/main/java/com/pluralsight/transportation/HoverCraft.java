package com.pluralsight.transportation;

public class HoverCraft extends Transportation {
    boolean hasPropellers;
    boolean canWaterTravel;

    public HoverCraft(String make, String model, int year, String vin, double mileage, double price, boolean hasPropellers, boolean canWaterTravel) {
        super(make, model, year, vin, mileage, price);
        this.hasPropellers = hasPropellers;
        this.canWaterTravel = canWaterTravel;
    }
}
