package com.RohanSoni;

public class StudyRoom {
    private double length;
    private double width;
    private double height;
    private Library library;
    private boolean hasAcInstalled;
    private boolean hasComputer;
    private int doors;
    private int windows;
    private int atWhichFloor;
    private Computer computer;

    public StudyRoom(double length,double width, double height, Library library,
                     boolean hasAcInstalled, boolean hasComputer, int doors,
                     int windows, int atWhichFloor,Computer computer) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.library = library;
        this.hasAcInstalled = hasAcInstalled;
        this.hasComputer = hasComputer;
        this.doors = doors;
        this.windows = windows;
        this.atWhichFloor = atWhichFloor;
        this.computer = computer;
    }

    public void switchOnAC(int temperature) {
        System.out.println("AC is switched on at temperature " + temperature);
    }

    public void turnOnBulb() {
        System.out.println("Bulb is turned on");
    }
    public Library getLibrary(){
        return library;
    }
}
