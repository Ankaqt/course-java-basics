package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private static Sphynx sphynx;

    @BeforeAll
    static void init() {
        sphynx = new Sphynx("Zi");
    }

    @Test
    void SiameseTest() {
        Assertions.assertEquals("Zi", sphynx.getName());
        Assertions.assertEquals("mao", sphynx.mew());
        Assertions.assertEquals("morr", sphynx.purr());
    }
}
