package com.RohanSoni;

public class Animal {
    // name => eg. dog, lion, elephant, crocodile, fish, octopus, eagle, snake, cockroach
    // weight => eg. Lion => 200 kg, Elephant => 2,000 Kg - 5,000 kg
    // foodHabits => eg. Herbivores, Carnivores, omnivores
    // bodyMovement eg. Walk, Run, Swim, Crawl, Fly

    private String name;
    private double weight;
    private String foodHabits;
    private String bodyMovement;
    private String lifeSpan;

    public Animal() {
        System.out.println("Empty Constructor");
    }

    public Animal(String name, double weight, String foodHabits, String bodyMovement, String lifeSpan) {
        this.name = name;
        this.weight = weight;
        this.foodHabits = foodHabits;
        this.bodyMovement = bodyMovement;
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return this.name;
    }

    public String getFoodHabits() {
        return foodHabits;
    }

    public String getBodyMovement() {
        return bodyMovement;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getLifeSpan() {
        return this.lifeSpan;
    }

    public String breadth(String animalName) {
        return animalName + " can breadth";
    }
}
