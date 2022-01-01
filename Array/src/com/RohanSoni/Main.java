package com.RohanSoni;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int myValue;
        myValue = 10;
        System.out.println(myValue);

        int[] myArray;
        myArray = new int[10];
        // creating a Array of size 10

        myArray[2] = 12;
        myArray[6] = 45;
        System.out.println(myArray[0] + ", " + myArray[2]);


        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(newArray[2]);
        System.out.println(newArray[4]);
        System.out.println(newArray[6]);
        System.out.println(newArray[8]);

        // storing the value using for loop

        int[] firstArray = new int[12];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i * 5;
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Value at position " + i + " in firstArray is " + firstArray[i]);
        }

        // passing the Array as a parameter to a method

//        int[] secondArray = new int[5];
//        setArray(secondArray);
//        printArray(secondArray);

//        Scanner scanner=new Scanner(System.in);

//        System.out.println("Enter your Name");
//        String name = scanner.nextLine();
//        System.out.println("Enter your Age");
//        int age = scanner.nextInt();
//        System.out.println("Hello, " + name + " you,re " + age + " years old");


        // Question no 1
        // finding the average of the entered value
//        int[] avgArray = setValue(5);
        // System.out.println("Average is "+average(avgArray));

        // sorting the array
        // getIntegers()
        // sortedArray()
        // printSortedArray()

//        int[] enteredArray = getIntegers(5);
//        int[] afterSorted = sortedArray(enteredArray);
//        printSortedArray(afterSorted);
    }

    public static int[] getIntegers(int size) {
        System.out.println("Enter the " + size + " value");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // 100, 120, 80, 10, 40, 5
    // 120, 100, 80, 40, 10, 5
    public static int[] sortedArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        // Alternative Method for coping Array
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("value at position " + i + " is " + array[i] + " in secondArray");
        }
    }

    public static int[] setValue(int size) {
        System.out.println("Enter " + size + " value");

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}

