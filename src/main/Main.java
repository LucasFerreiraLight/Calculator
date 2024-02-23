package main;

import model.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Addition
        System.out.println(calc.additionNumber(25.5, 55.5));

        //Subtraction
        System.out.println(calc.subtractionNumber(25.0, 55.0));

        //Multiplication
        System.out.println(calc.multiplyNumber(25.0, 55.0));

        //Division
        System.out.println(calc.divisionNumber(25.2,55.2));

    }
}