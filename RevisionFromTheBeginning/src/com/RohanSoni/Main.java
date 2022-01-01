package com.RohanSoni;


public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        // dataTypes

        // 1. primitive types => int, double, float, boolean, short, long
        // 2. non-primitive types => String, Array

//        int myInteger = 10;
//        double myDouble = 18.498;
//        float myFloat = 4;
//        boolean myBoolean = true;
//        short myShort = 19;
//        long myLong = 45;
//        char myChar = 'r';

        // Maximum and Minimum Values of Primitive data Types

        /*System.out.println("integer maximum value : "+Integer.MAX_VALUE+
                ", integer minimum value : "+Integer.MIN_VALUE);

        System.out.println("double maximum value : "+Double.MAX_VALUE +
                ", double minimum value : "+Double.MIN_VALUE);

        System.out.println("float maximum value : "+Float.MAX_VALUE +
                ", float minimum value : "+Float.MIN_VALUE);

        System.out.println("long maximum value : "+Long.MAX_VALUE +
                ", long minimum value : "+Long.MIN_VALUE);

        System.out.println("short maximum value : "+Short.MAX_VALUE +
                ", short minimum value : "+Short.MIN_VALUE);*/

        // casting

        int myIntValue = (int) 45.5;
        System.out.println(myIntValue);

        // if-then statement

        boolean night = true;
        if (night) {
            System.out.println("turning on the lights");
        }

        // if-else statements

        /*int time = 13;

        if (time < 12) {
            System.out.println("good morning");
        } else if (time <= 16 && time >= 12) {
            System.out.println("good afternoon");
        } else if (time > 16) {
            System.out.println("good evening");
        }*/

        // ternary operator

        /*int age = 13;
        boolean canDrink;
        if (age >= 18) {
            canDrink = true;
        } else canDrink = false;
        canDrink = age >= 18 ? true : false;

        System.out.println(canDrink);*/

        // largest number using ternary operator

        /*int firstNumber = 20;
        int secondNumber = 10;
        int largestNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
        System.out.println(largestNumber);

        firstNumber = 10;
        secondNumber = 20;
        int thirdNumber = 5;

        largestNumber = (firstNumber > secondNumber) ? ((firstNumber > thirdNumber) ? firstNumber : thirdNumber) :
                ((secondNumber > thirdNumber) ? secondNumber : thirdNumber);
        System.out.println(largestNumber);*/

        int myAge = getAge(2002);

        System.out.println(myAge);
        printMyInfo("rohan soni", 19, true);
    }

    public static int getAge(int birthYear) {
        return 2021 - birthYear;
    }

    // method overloading

    public static void printMyInfo(int age) {
        System.out.println("your age is " + age);
    }

    public static void printMyInfo(String name, int age) {
        System.out.println("Hello " + name + "\nyour age is " + age);
    }

    public static void printMyInfo(String name, int age, boolean student) {
        System.out.println("Hello " + name + "\nyour age is " + age + ", "
                + (student ? "you are student " : "you are not student"));
    }

}
