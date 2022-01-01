package com.RohanSoni;

public class DrawingRoom {
    private int sofa;
    private int lightBulb;
    private int table;
    private boolean hasACInstalled;
    private boolean hasLEDInstalled;
    private int painting;
    private AC ac;
    private LED led;

    public DrawingRoom(int sofa, int lightBulb, int table, boolean hasACInstalled, boolean hasLCDInstalled, int painting) {
        this.sofa = sofa;
        this.lightBulb = lightBulb;
        this.table = table;
        this.hasACInstalled = hasACInstalled;
        this.hasLEDInstalled = hasLCDInstalled;
        this.painting = painting;
    }

    public void turnOnLED(boolean buttonPressed) {
        if (buttonPressed)
            System.out.println("LCD is getting turned on");
    }

    public void turnOnAC(int temperature) {
        System.out.println("AC is getting turned on");
    }
}
