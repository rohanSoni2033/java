package com.RohanSoni;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter a number :");
            boolean hasAnInteger = scanner.hasNext();;
            if (hasAnInteger) {
                int number = scanner.nextInt();
                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max value = "+max+", Min value = "+min);
        scanner.close();
    }
}
