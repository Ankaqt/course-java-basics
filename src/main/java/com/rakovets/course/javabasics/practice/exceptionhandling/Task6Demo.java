package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            Task6.ThreeExceptions();
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException ex) {
            String message = ex.toString();
            System.out.println(message);
        } catch (NegativeArraySizeException ex) {
            System.out.println("Negative array size");
        }
    }
}