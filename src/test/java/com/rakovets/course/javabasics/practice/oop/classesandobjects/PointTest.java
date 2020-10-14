package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(8,9);
        Point point2 = new Point(7,6);
        double distance = point1.distance(point2);
        System.out.printf("x : %d, y : %d",point1.getX(),point1.getY());
        System.out.printf("\nx : %d, y : %d",point2.getX(),point2.getY());
        System.out.printf("\nDistance: %f",distance);
        point1.setX(12);
        point1.setY(11);
        System.out.printf("\nx : %d, y : %d",point1.getX(),point1.getY());
        System.out.printf("\nx : %d, y : %d",point2.getX(),point2.getY());
        System.out.printf("\nDistance: %f",point1.distance(point2));
    }
}
