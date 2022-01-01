package com.RohanSoni;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Enter the size for the Array : ");
//        int size= scanner.nextInt();
//        System.out.println("Enter "+size+" values");
//        int[] newArray = new int[size];
//        for (int i=0;i<size;i++){
//            newArray[i]=scanner.nextInt();
//        }
//
//        int[] reversedArray = new int[size];
//        for (int i=0;i<newArray.length;i++){
//            reversedArray[reversedArray.length-(1+i)]=newArray[i];
//        }
//
//        for (int i=0;i<reversedArray.length;i++){
//            System.out.println("value at " +i+" is "+reversedArray[i]);
//        }

        printArray(reverseArray(getIntegers(5)));
    }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        for (int i=0;i<reverseArray.length;i++){
            reverseArray[reverseArray.length-(i+1)]=array[i];
        }
        return reverseArray;
    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("value at "+i+" is "+array[i]);
        }
    }
}
