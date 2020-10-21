package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Mag extends Hero {
    public Mag (String name, int health) {
        super(name);
        this.health = health;
    }

    public Mag(String name) {
        super(name);
        this.health = 0;
    }

    @Override
    public void attackEnemy(Enemy enemy ) {
        enemy.takeDamage(1);
        System.out.println("Warrior attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(8);
        System.out.println("Enemy attacks the warrior");
    }
}
