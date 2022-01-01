package com.RohanSoni;

public class Main {

    public static void main(String[] args) {
//        System.out.println(area(5.0));
//        System.out.println(area(-1));
//        System.out.println(area(5.0, 4.0));
//        System.out.println(area(-1.0, 4.0));
//        System.out.println(getDurationString(120,1900));
//        System.out.println(getDurationString(0,10800));
//    printYearsAndDays(525600);
//        printYearsAndDays(561600);
        printEqual(1,2,1);


    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0) {
            minutes += seconds / 60;
            int remainingSeconds = seconds % 60;
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            return hours +"h "+ remainingMinutes +"m " +remainingSeconds+"s";
        } else {
            return "invalid value";
        }
    }
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            int days=(int)minutes/1440;
            int remainingMinutes=(int)minutes%1440;
            int years=days/365;
            int remainingDays=days%365;
            System.out.println(minutes + " min = " + years+" y and "+remainingDays+" d");
        }
    }
//    int firstNumber,int secondNumber,int thirdNumber
    public static void printEqual(int firstNumber,int secondNumber,int thirdNumber){
        if (firstNumber<0 || secondNumber<0 || thirdNumber<0){
            System.out.println("Invalid Value");
        }
        else if((firstNumber==secondNumber) && (secondNumber==thirdNumber)){
            System.out.println("All numbers are equal");
        }
        else if(firstNumber!=secondNumber && secondNumber!=thirdNumber && firstNumber!= thirdNumber){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }

}
