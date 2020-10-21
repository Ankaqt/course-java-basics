package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Hero {
    public String name;
    public int health;

    public Hero(String name) {
        this.name = name;
        this.health = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Enemy attacks the hero");
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(2);
        System.out.println("Hero attacks the enemy");
    }
}
