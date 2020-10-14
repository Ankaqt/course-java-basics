package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(88, 765, 875);
        Time time2 = new Time(6515);
        System.out.printf("Hours: %d, minutes: %d,second: %d",time1.getHours(),time1.getMinutes(),time1.getSeconds());
        System.out.printf("\nTotal seconds: %d",time2.getTotalSeconds());

        time1.setHours(98);
        time1.setMinutes(980);
        time1.setSeconds(562);
        System.out.printf("\nHours: %d, minutes: %d,second: %d",time1.getHours(),time1.getMinutes(),time1.getSeconds());
    }
}
