package com.RohanSoni;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal();

        Lion lion = new Lion("Lion", 30, "Carnivores",
                "Walk, Run", "10 - 12 years", 60, "beef, lamb, goat, etc.");

        System.out.println("About Lion");

        System.out.println(lion.getName() + " is a " + lion.getFoodHabits() + " Which has a life span of "
                + lion.getLifeSpan() + " and they can be up to " + lion.getWeight() + " kg , \n" +
                lion.getName() + " usually eats " + lion.getDiet() + ", " +
                lion.getName() + " can " + lion.getBodyMovement() +
                " and They can " + lion.runningSpeed() + " to hunt.");


        Octopus octopus = new Octopus("Octopus", 12, "Carnivores", "Swim",
                "2 - 15 years", "Crabs", "blue", 8);

        System.out.println("About Octopus");

        octopus.largestBreads = "Giant Pacific Octopus";

        octopus.smallestBreads = "Octopus wolfi";

        System.out.println(octopus.largestBreads + " is the largest bread of octopus and " +
                "" + octopus.smallestBreads + " is the smallest");

        System.out.println(octopus.getName() + " is a " + octopus.getFoodHabits() + " Which has a life span of "
                + octopus.getLifeSpan() + " and they can be up to " + octopus.getWeight() + " kg , \n"
                + octopus.getName() + " have " + octopus.getNumberOfTentacles() + " Tentacles, and " +
                octopus.bloodColor() + ", " + octopus.getName() + " usually eats " + octopus.getDiet() +
                " " + octopus.getName() + " can " + octopus.getBodyMovement());

        Eagle eagle=new Eagle("Eagle",6.5,"Carnivores","fly",
                "15 - 30 years", "fish, mammals, reptiles, etc.,","20/8 - 20/5",
                160,"Philippine Eagle","BaldEagle");

        System.out.println("About Eagle");

        System.out.println(eagle.getName() + " is a " + eagle.getFoodHabits() + " Which has a life span of "
                + eagle.getLifeSpan() + " and they can be up to " + eagle.getWeight() + " kg,\n"
                + eagle.getName() + " has the visual acuity of "+eagle.getVisualAcuity() +" which 3 to 3.6 " +
                "times more than human\n"+ eagle.getName() + " usually eats " + eagle.getDiet() +""+eagle.getName()+
                " can " + eagle.getBodyMovement() + " and they can "+eagle.flyingSpeed());

        System.out.println(animal.breadth(eagle.getName()));

    }


}
