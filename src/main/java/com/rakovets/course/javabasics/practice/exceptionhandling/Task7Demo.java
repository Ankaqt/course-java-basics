package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            Task7.NewException();
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds!");
        } finally {
            System.out.println("Thanks for using!");
        }
    }
}
