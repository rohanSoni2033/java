package com.RohanSoni;

public class Display {
    private String type;
    private double sizeInInches;
    private Resolution resolution;

    public Display(String type, double sizeInInches, Resolution resolution) {
        this.type = type;
        this.sizeInInches = sizeInInches;
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    public double getSizeInInches() {
        return sizeInInches;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
