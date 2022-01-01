package com.RohanSoni;

public class Eagle extends Animal{
    private String visualAcuity;
    private int flyingSpeed;
    private String rarestBreads;
    private String popularBrads;
    private String diet;

    public Eagle(String name, double weight, String foodHabits, String bodyMovement,
                 String lifeSpan, String diet, String visualAcuity, int flyingSpeed, String rarestBreads, String popularBrads){
        super(name, weight, foodHabits, bodyMovement, lifeSpan);

        this.diet=diet;
        this.visualAcuity = visualAcuity;
        this.flyingSpeed = flyingSpeed;
        this.rarestBreads = rarestBreads;
        this.popularBrads = popularBrads;
    }

    public String flyingSpeed(){
        return "fly up to "+this.flyingSpeed+" km/h";
    }

    public String getDiet() {
        return diet;
    }

    public String getVisualAcuity() {
        return visualAcuity;
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public String getRarestBreads() {
        return rarestBreads;
    }

    public String getPopularBrads() {
        return popularBrads;
    }
}
