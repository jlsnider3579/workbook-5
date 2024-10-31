package com.pluralsight.transportation;

public class Moped extends Transportation {
    int numberOfWheels;
    boolean hasPedals;
    String specialLicence;

    public Moped(String make, String model, int year, String vin, double mileage, double price, int numberOfWheels, boolean hasPedals, String specialLicence) {
        super(make, model, year, vin, mileage, price);
        this.numberOfWheels = numberOfWheels;
        this.hasPedals = hasPedals;
        this.specialLicence = specialLicence;
    }
}
