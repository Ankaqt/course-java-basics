package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Enemy implements Mort {
    public int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive (Enemy enemy) {
        if(health >  0) {
            return true;
        } else {
            return false;
        }
    }
}
