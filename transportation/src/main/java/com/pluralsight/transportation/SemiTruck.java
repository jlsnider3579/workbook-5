package com.pluralsight.transportation;

public class SemiTruck extends Transportation {
    int numberOfWheels;
    double loadCapacity;
    String trailerType;

    public SemiTruck(String make, String model, int year, String vin, double mileage, double price, int numberOfWheels, double loadCapacity, String trailerType) {
        super(make, model, year, vin, mileage, price);
        this.numberOfWheels = numberOfWheels;
        this.loadCapacity = loadCapacity;
        this.trailerType = trailerType;
    }
}
