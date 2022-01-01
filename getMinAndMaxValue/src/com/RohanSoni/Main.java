package com.RohanSoni;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Minimum Value in Array : "+getMinimumValue(sortedArray(getIntegers(5))));
        System.out.println("Maximum Value in Array : "+getMaximumValue(sortedArray(getIntegers(5))));

    }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        System.out.println("Enter "+size+" value");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortedArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
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
    public static int getMinimumValue(int[] array){
        int minimumValue = array[array.length-1];
        return minimumValue;
    }

    public static int getMaximumValue(int[] array){
        int maximumValue = array[0];
        return maximumValue;
    }
}
