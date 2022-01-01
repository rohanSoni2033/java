package com.RohanSoni;

public class Lion extends Animal{
    private double speed;
    private String diet;
    public Lion(String name, double weight, String foodHabits, String bodyMovement, String lifeSpan, double speed,String diet) {
        super(name, weight, foodHabits, bodyMovement, lifeSpan);
        this.diet=diet;
        this.speed=speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getDiet() {
        return this.diet;
    }
    public String runningSpeed(){
        return "run up to "+this.speed+" km/h";
    }
}
