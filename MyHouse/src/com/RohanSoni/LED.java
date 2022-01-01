package com.RohanSoni;

public class LED {
    private String displaySize;
    private String type;
    private String resolution;

    public LED(String displaySize, String type, String resolution) {
        this.displaySize = displaySize;
        this.type = type;
        this.resolution = resolution;
    }

    public void turnOff(){
        System.out.println("tuning off the LED");
    }
}
