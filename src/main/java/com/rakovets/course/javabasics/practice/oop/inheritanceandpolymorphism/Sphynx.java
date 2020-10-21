package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat {
    public Sphynx(String name) {

        super(name);
    }
    @Override
    public String mew() {

        return "mao";
    }
    @Override
    public String purr() {

        return "morr";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-5);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(5);
    }
}
