package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {
        double[] numb = new double[5];
        try {
            numb[7] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }
    }
}
