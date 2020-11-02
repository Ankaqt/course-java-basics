package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task6 {
    public static void ThreeExceptions() throws NegativeArraySizeException, StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
        int random = (int) (Math.random() * (3) + 1);
        System.out.println(random);
        String str = "qw";
        char ch = str.charAt(random);
        int[] arr1 = new int[2];
        arr1[random] = 7;
        int[] arr = new int[-random];
    }
}
