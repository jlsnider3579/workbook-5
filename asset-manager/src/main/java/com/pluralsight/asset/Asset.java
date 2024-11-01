package com.pluralsight.asset;

public class Asset {
    private String description;
    private String dateRequired;
    private double originalCost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateRequired() {
        return dateRequired;
    }

    public void setDateRequired(String dateRequired) {
        this.dateRequired = dateRequired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public Asset(String description, String dateRequired, double originalCost) {
        this.description = description;
        this.dateRequired = dateRequired;
        this.originalCost = originalCost;

    }
    public double getValue() {
        return originalCost;
    }
}
