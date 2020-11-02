package com.rakovets.course.javabasics.practice.exceptionhandling;

//Task3

public class Cat {
    private String name;
    private boolean didCatEat;
    private boolean didCatPlay;

    public Cat(String name) {
        this.name = name;
    }

    public void catEat() {
        System.out.println("Cat ate!");
        this.didCatEat = true;
    }

    public void catPlay() {
        System.out.println("Cat played!");
        this.didCatPlay = true;

    }

    public class CatIsNotReadyToSleepException extends Exception {
        public CatIsNotReadyToSleepException(String message) {
            super(message);
        }
    }

    public void sleep() throws CatIsNotReadyToSleepException {
        System.out.println("What will cat do?");
        if (didCatEat && didCatPlay) {
            System.out.println("Cat is sleeping on your bed.");
        } else {
            throw new CatIsNotReadyToSleepException("Cat " + name + " runs around the house and meows!Calm him down!");
        }
    }
}

