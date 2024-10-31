package com.pluralsight.transportation;

public class Car extends Transportation {
    int numberOfDoors;
    boolean hasVEngine;
    boolean hasSunroof;

    public Car(String make, String model, int year, String vin, double mileage, double price, int numberOfDoors, boolean hasVEngine, boolean hasSunroof) {
        super(make, model, year, vin, mileage, price);
        this.numberOfDoors = numberOfDoors;
        this.hasVEngine = hasVEngine;
        this.hasSunroof = hasSunroof;
    }
}
