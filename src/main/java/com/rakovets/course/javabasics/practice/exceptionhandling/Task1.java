package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
    public static void main(String[] args) {
        try {
            String str = null;
            str.concat("");
        } catch (NullPointerException e) {
            System.out.println("Code has NPE!");
        }
    }
}
