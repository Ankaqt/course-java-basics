package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MagTest {
    private static Mag mag;

    @BeforeAll
    static void init() {
        mag = new Mag("Slyer", 81);
    }

    @Test
    void warriorTest() {
        Assertions.assertEquals("Slyer", mag.getName());
        Assertions.assertEquals(81, mag.getHealth());
    }
}
