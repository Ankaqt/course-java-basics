package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    private int x;
    private int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        int a = point.x - this.x;
        int b = point.y - this.y;
        double distance = Math.sqrt(a * a + b * b);
        return distance;
    }
}
