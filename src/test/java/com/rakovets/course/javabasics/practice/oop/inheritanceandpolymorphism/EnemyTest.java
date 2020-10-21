package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    public static Enemy enemy;

    @BeforeAll
    static void init() {
        enemy = new Enemy(58);
    }

    @Test
    void enemyTest() {
        Assertions.assertEquals(58, enemy.getHealth());
        Assertions.assertEquals(true, enemy.isAlive(enemy));
    }

}
