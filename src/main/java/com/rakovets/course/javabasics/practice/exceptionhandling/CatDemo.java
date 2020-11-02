package com.rakovets.course.javabasics.practice.exceptionhandling;

//Task3

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Venik");
        cat.catPlay();
        try {
            cat.sleep();
        } catch (Cat.CatIsNotReadyToSleepException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
