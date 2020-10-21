package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CatTest {
    private static Cat cat;

    @BeforeAll
    static void init() {
        cat = new Cat("Keks");
    }

    @Test
    void catTest() {
        Assertions.assertEquals("Keks", cat.getName());
        Assertions.assertEquals("mew", cat.mew());
        Assertions.assertEquals("purr", cat.purr());
    }
}
