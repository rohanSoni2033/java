package com.RohanSoni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int[] values = getIntegers(5);
//        for (int i = 0; i < values.length; i++) {
//            System.out.println("value at " + i + " is " + values[i] + " in Array");
//        }

        int[] newArray=sortedArray(getIntegers(6));
        //String arrayString = newArray.toString();
        System.out.print("[");
        for (int i=0;i<newArray.length;i++){

            System.out.print(newArray[i]+" ");

        }
        System.out.print("]");

//        System.out.println(arrayString);
    }

    public static int[] getIntegers(int size) {
        System.out.println("Enter " + size + " Integers");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortedArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = array[i];
//        }


        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
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

}
