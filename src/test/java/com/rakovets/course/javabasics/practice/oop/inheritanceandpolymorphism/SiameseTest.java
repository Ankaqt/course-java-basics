package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    private static Siamese siamese;

    @BeforeAll
    static void init() {
        siamese = new Siamese("Mars");
    }

    @Test
    void SiameseTest() {
        Assertions.assertEquals("Mars", siamese.getName());
        Assertions.assertEquals("meme", siamese.mew());
        Assertions.assertEquals("rrr", siamese.purr());
    }
}
