package com.RohanSoni;

public class Resolution {
    private int pixelAtX;
    private int pixelAtY;

    public Resolution(int pixelAtX, int pixelAtY) {
        this.pixelAtX = pixelAtX;
        this.pixelAtY = pixelAtY;
    }

    public int getPixelAtX() {
        return pixelAtX;
    }

    public int getPixelAtY() {
        return pixelAtY;
    }

    public void draw(int pixelAtX, int pixelAtY, String color){
        System.out.println("Drawing at pixel "+pixelAtX +" and "+pixelAtY+" in "+color+" color");
    }
}
