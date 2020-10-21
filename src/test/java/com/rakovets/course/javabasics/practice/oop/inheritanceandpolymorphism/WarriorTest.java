package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    private static Warrior warrior;

    @BeforeAll
    static void init() {
        warrior = new Warrior("Dimamvp", 99);
    }

    @Test
    void warriorTest() {
        Assertions.assertEquals("Dimamvp", warrior.getName());
        Assertions.assertEquals(99, warrior.getHealth());
    }
}
