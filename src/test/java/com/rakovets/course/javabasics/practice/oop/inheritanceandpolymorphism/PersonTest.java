package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private static Person person;

    @BeforeAll
    static void init() {
        person = new Person(55);
    }

    @Test
    void PersonTest () {
        Assertions.assertEquals(55, person.getHappiness());
        Assertions.assertEquals(60, person.changeHappiness(5));
    }
}
