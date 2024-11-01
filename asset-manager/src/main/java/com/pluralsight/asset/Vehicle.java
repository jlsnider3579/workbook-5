package com.pluralsight.asset;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateRequired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateRequired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double valuePerYear;

        switch (year) {
            case 1:
                valuePerYear = -3;
                break;
            case 2:
                valuePerYear = -6;
                break;
            case 3:
                valuePerYear = -8;
            case 4:
                valuePerYear = -1000.0;
                break;
            default:
                valuePerYear = 0;
        }
        return (year * valuePerYear) - (0.25 * odometer);
    }
}