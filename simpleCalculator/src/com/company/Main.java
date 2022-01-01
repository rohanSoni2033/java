package com.company;
public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(4);

        double additionResult = calculator.getAdditionResult();
        double subtractionResult = calculator.getSubtractionResult();
        double multiplicationResult = calculator.getMultiplicationResult();
        double divisionResult = calculator.getDivisionResult();

        System.out.println("addition of " + calculator.getFirstNumber()+" and "
                + calculator.getSecondNumber()+ " is equal to " + additionResult);
        System.out.println("subtraction of " + calculator.getFirstNumber()+" and "
                + calculator.getSecondNumber()+ " is equal to " + subtractionResult);
        System.out.println("multiplication of " + calculator.getFirstNumber()+" and "
                + calculator.getSecondNumber()+ " is equal to " + multiplicationResult);
        System.out.println("division of " + calculator.getFirstNumber()+" and "
                + calculator.getSecondNumber()+ " is equal to " + divisionResult);
    }
}
