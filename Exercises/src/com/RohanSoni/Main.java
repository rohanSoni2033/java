package com.RohanSoni;

public class Main {

    public static void main(String[] args) {
        

        System.out.println(toMilesPerHour(45));

        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.17568));
        System.out.println(areEqualByThreeDecimalPlaces(1.5455, 1.9393));
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else {
            int days = (int) minutes / 60;
            int remainingMinutes = (int) minutes % 60;
            int years = (int) days / 365;
            int remainingDays = days % 365;
            System.out.println(minutes +" min = "+years + " Y and "+remainingDays);
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;

        firstNumber = (int) firstNumber;
        secondNumber = (int) secondNumber;

        if (firstNumber == secondNumber) {
            return true;
        } else return false;
    }

    public static int toMilesPerHour(int kilometerPerHour) {
        if (kilometerPerHour < 1) {
            return -1;
        } else {
            long mile = (long) (kilometerPerHour / 1.609);

            return Math.round(mile);
        }
    }


}
