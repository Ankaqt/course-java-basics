package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    private static Archer archer;

    @BeforeAll
    static void init() {
        archer = new Archer("Lolly", 78);
    }

    @Test
    void warriorTest() {
        Assertions.assertEquals("Lolly", archer.getName());
        Assertions.assertEquals(78, archer.getHealth());
    }
}

