package com.RohanSoni;

public class AC {
    private String brandName;
    private double price;
    private String color;
    private boolean alexa;

    public AC(String brandName, double price, String color, boolean alexa) {
        this.brandName = brandName;
        this.price = price;
        this.color = color;
        this.alexa = alexa;
    }

    public void changeTemperature(int temperature){
        System.out.println("changing temperature  to "+temperature);
    }
    public void turnOffAC(){
        System.out.println("turning off the AC");
    }

}
