package com.rakovets.course.javabasics.practice.exceptionhandling;

// Task5

public class PrintDemo {
    public static void main(String[] args) {
        Print print = new Print(null);
        try {
            print.printException();
        } catch (Print.NoDataException ex) {
            System.out.println(ex.toString());
        }
    }
}
