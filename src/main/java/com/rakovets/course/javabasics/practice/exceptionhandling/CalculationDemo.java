package com.rakovets.course.javabasics.practice.exceptionhandling;

//Task4

public class CalculationDemo {
    public static void main(String[] args) {
        Calculation calculation = new Calculation(1, 0);
        try {
            calculation.calculate();
        } catch (Calculation.ArithmeticException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
