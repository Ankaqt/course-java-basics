package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }
    @Override
    public String mew() {
        return "meme";
    }
    @Override
    public String purr() {
        return "rrr";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-3);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(1);
    }
}
