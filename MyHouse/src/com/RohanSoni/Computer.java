package com.RohanSoni;

public class Computer {
    private String brandName;
    private String monitor;
    private int ram;
    private String storageType;
    private int storage;

    public Computer(String brandName, String monitor, int ram, String storageType, int storage) {
        this.brandName = brandName;
        this.monitor = monitor;
        this.ram = ram;
        this.storageType = storageType;
        this.storage = storage;
    }

    public void turnOnComputer(){
        System.out.println("turning on the computer");
    }
}
