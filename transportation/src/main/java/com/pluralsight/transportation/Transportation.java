package com.pluralsight.transportation;

public class Transportation {
    protected String make;
    protected String model;
    protected int year;
    protected String vin;
    protected double mileage;
    protected double price;

    public Transportation(String make, String model, int year, String vin, double mileage, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.mileage = mileage;
        this.price = price;
    }
}

