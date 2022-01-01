package com.RohanSoni;


public class Main {
    // stars patterns
    /*   Question no 1

     *
     **
     ***
     ****
     *****
     ******

     */
    /*   Question no 2

     ******
     *****
     ****
     ***
     **
     *

     */
    /*   Question no 3

     *
     ***
     *****
     *******
     *********

     */
    /*   Question no 4

     *********
     *******
     *****
     ***
     *

     */
    /*   Question no 5

     *
     ***
     *****
     *******
     *********
     **********
     *********
     *******
     *****
     ***
     *


     */
    // number patterns
    /*   Question no 6
          1
          12
          123
          1234
          12345
          123456

     */
    /*   Question no 7

    1
    22
    333
    4444
    55555
    666666

     */
    /*   Question no 8

    1
    23
    456
    7890
    12345
    678901
    1234567
    89012345

     */
    /*   Question no 9

      2
     468
    101214
   16182022
  2426283032


     */
    /*   Question no 10

     */
    // alphabetic patterns

    // square
    // To print a SQUARE we need equal number of ROW and COLUMN


    public static void main(String[] args) {
        System.out.println("Square pattern");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("❤ ");
            }
            System.out.println(" ");

        }

        System.out.println("right angle triangle pattern");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("⭐");
            }
            System.out.println(" ");
        }
        System.out.println("inverted right angle triangle pattern");
        System.out.println("Pattern Number 3");

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("equilateral triangle triangle");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("inverted equilateral triangle triangle");
        System.out.println("pyramid pattern");

        for (int i = 0; i < 6; i++) {
            for (int k = i; k < 5; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Number Patters Using While Loops");

        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Pattern Number 4");
        System.out.println(" ");

        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Pattern Number 2");

        for (int i = 0; i < 6; i++) {
            for (int k = i; k < 6; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("Pattern Number 6");

        for (int i = 0; i < 6; i++) {
            for (int k=i;k<6;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 5; i >= 0; i--) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = i * 2 + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


//        *****
//        ** **
//        * * *
//        ** **
//        *****


//      ********
//      **    **
//      * *  * *
//      *  **  *
//      *  **  *
//      * *  * *
//      **    **
//      ********

    }

}


