package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersianTest {
    private static Persian persian;

    @BeforeAll
    static void init() {
        persian = new Persian("Molly");
    }

    @Test
    void PersianTest() {
        Assertions.assertEquals("Molly", persian.getName());
        Assertions.assertEquals("meow", persian.mew());
        Assertions.assertEquals("murr", persian.purr());
    }
}