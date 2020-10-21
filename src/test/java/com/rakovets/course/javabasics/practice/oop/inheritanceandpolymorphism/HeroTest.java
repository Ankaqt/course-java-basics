package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeroTest {
    private static Hero hero;

    @BeforeAll
    static void init() {
        hero = new Hero("An",100);
    }

    @Test
    void heroTest() {
        Assertions.assertEquals("An", hero.getName());
        Assertions.assertEquals(100, hero.getHealth());
    }
}
