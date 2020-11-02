package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7 {
    public static void NewException() throws StringIndexOutOfBoundsException {
        int random = (int) (Math.random() * 2);
        System.out.println(random);
        String str = "7";
        char ch = str.charAt(random);
        System.out.println("The sign is " + ch);


    }
}
