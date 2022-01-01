public class Main {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        printConversion(1.5);
        printConversion(10);
        System.out.println(shouldWakeUp(true, 4));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(2004));
        System.out.println("hasEqualSum : " + hasEqualSum(10, 20, 30));
//        double miles=2;
//        long kilometer = (long) (miles*1.609);

//        double kilometer=10.25;
//        double miles= kilometer/1.609;
//        long rounded=Math.round(miles);
//        long rounded = (long) miles; // casting double into long
//        System.out.println(rounded);

        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(2020));
        System.out.println(sumOdd(1, 10));

        System.out.println(isPalindrome(121));
        // 3 +5 +7+9
        System.out.println(sumFirstAndLastDigit(134));

        System.out.println(getEvenDigitSum(123456));

        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println(i + " is divisible with both 3 and 5");
                sum += i;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);


        hasSameLastDigit(474, 94, 123);

        getGreatestCommonDivisor(12, 30);
        printFactors(12);
        isPerfectNumber(6);
    }

    //     Question no.1
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double intoMiles = kilometersPerHour / 1.609;
            return Math.round(intoMiles);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else return false;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(boolean firstNumber, boolean secondNumber) {


        return false;
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber == thirdNumber;
    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int x) {
        if (x >= 13 && x <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int odd) {
        if (odd < 0) {
            return false;
        } else {
            if (odd % 2 != 0) {
                return true;
            } else
                return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > end || end < 0 || start < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int tempNumber = number;
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0) {

            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println("number : " + tempNumber + ", reverse number : " + reverse);

        if (reverse == tempNumber) {

            return true;
        } else {
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int reverse = 0;
            int sum = 0;
            int lastDigit = number % 10;
            int tempLastDigit = 0;
            // experiment number : 134
            while (number != 0) {
                tempLastDigit = number % 10;
                reverse = reverse * 10 + tempLastDigit;
                number = number / 10;
            }

            int firstDigit = reverse % 10;
            System.out.println("first digit : " + firstDigit + " last digit : " + lastDigit + " reverse : " + reverse);
//            System.out.println(firstDigit+lastDigit);
            return (firstDigit + lastDigit);
        }

    }


    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int digit = 0;
            int sum = 0;
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                number = number / 10;
            }
            return sum;
        }

    }

   public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
       // experiment number 12 23
       if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
           return false;
       } else {
           int firstNumberLastDigit = 0;
           int firstNumberFirstDigit = 0;
           int secondNumberFirstDigit = 0;
           int secondNumberLastDigit = 0;

           while (firstNumber != 0 && secondNumber != 0) {
               firstNumberLastDigit = firstNumber % 10;
               firstNumber = firstNumber / 10;
               firstNumberFirstDigit = firstNumber % 10;

               secondNumberLastDigit = secondNumber % 10;
               secondNumber = secondNumber / 10;
               secondNumberFirstDigit = secondNumber % 10;
           }
           System.out.println("first number : " + firstNumber + ", second number : " + secondNumber +
                   ", first number first digit : " + firstNumberFirstDigit + ", first number last digit : "
                   + firstNumberLastDigit + ", second number first digit : " + secondNumberFirstDigit +
                   "second number last digit : " + secondNumberLastDigit);
           if (secondNumberLastDigit == firstNumberLastDigit) {
               return true;
           } else if (secondNumberLastDigit == firstNumberFirstDigit) {
               return true;
           } else if ((secondNumberFirstDigit == firstNumberFirstDigit)) {
               return true;
           } else if (secondNumberFirstDigit == firstNumberLastDigit) {
               return true;
           } else {
               return false;
           }

       }
   }
   public static boolean hasSharedDigit(int firstNumber, int secondNumber){


   }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber > 1000 || firstNumber < 10) || (secondNumber > 1000 || secondNumber < 10) || (thirdNumber > 1000 || thirdNumber < 0)) {
            return false;
        } else {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;
            if ((firstNumberLastDigit == secondNumberLastDigit)
                    || (secondNumberLastDigit == thirdNumberLastDigit) ||
                    (thirdNumberLastDigit == firstNumberLastDigit)) {
                return true;
            } else

                return false;

        }
    }

    public static boolean isValid(int number) {
        if (number > 1000 || number < 10) {
            return false;
        } else
            return true;
    }


    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {

            int count;
            count = 1;
            System.out.println("first number : " + first + ", second number : " + second);
            while (count != first) {
                if (first % count == 0) {
                    System.out.println("divisor found : " + count + " of 12");
                }
                count++;
            }
            count = 1;
            while (count != second) {
                if (second % count == 0) {
                    System.out.println("divisor found : " + count + " of 30");
                }
                count++;
            }
            return 1;
        }
    }

    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Value");
        else {
            int count = 1;
            while (number >= count) {
                if (number % count == 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }


    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int divisorSum = 0;
            int count = 1;
            while (number != count) {
                if (number % count == 0) {
                    divisorSum += count;
                }
                count++;
            }
            if (number == divisorSum) {
                return true;
            } else {
                return false;
            }
        }
    }
}






