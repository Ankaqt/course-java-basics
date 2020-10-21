package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name);
        this.health = health;
    }

    public Archer(String name) {
        super(name);
        this.health = 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(4);
        System.out.println("Warrior attacks the enemy");
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(2);
        System.out.println("Enemy attacks the warrior");
    }
}
