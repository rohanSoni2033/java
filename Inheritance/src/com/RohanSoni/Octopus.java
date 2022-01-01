package com.RohanSoni;

public class Octopus extends Animal{
    private int numberOfTentacles;
    private String bloodColor;
    private String diet;

    public int getNumberOfTentacles() {
        return numberOfTentacles;
    }

    public String getBloodColor() {
        return bloodColor;
    }

    String largestBreads;
    String smallestBreads;

    public String getDiet() {
        return diet;
    }

    public Octopus(String name, double weight, String foodHabits, String bodyMovement,
                   String lifeSpan, String diet, String bloodColor, int numberOfTentacles){
        super(name, weight, foodHabits, bodyMovement, lifeSpan);
        this.diet=diet;
        this.bloodColor=bloodColor;
        this.numberOfTentacles=numberOfTentacles;
    }
    public String breads(){
        return this.largestBreads+" is the largest breads and " +this.smallestBreads+ " smallest breads of octopus";
    }
    public String bloodColor(){
        return "there blood is " + this.bloodColor;
    }


//    @Override
//    public String breadth(String animalName){
//        return this.getName()+" can breadth";
//    }

}
