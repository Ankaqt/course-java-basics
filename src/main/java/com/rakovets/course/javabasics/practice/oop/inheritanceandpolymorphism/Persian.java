package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }
    @Override
    public String mew() {
        return "meow";
    }
    @Override
    public String purr() {
        return "murr";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-2);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(6);
    }
}
