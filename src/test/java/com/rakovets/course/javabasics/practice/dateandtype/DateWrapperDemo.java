package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate date = DateWrapper.getLocalDate(2000, 03, 07);
        System.out.println(date);

        LocalDate date1 = DateWrapper.getNewLocalDate(date, 2);
        System.out.println(date1);

        String data3 = DateWrapper.getLocalDateAsStringWithPattern(date1, "MM, dd, yyyy");
        System.out.println(data3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate date4 = DateWrapper.getLocalDateWithNewPattern("марта 7, 2020", formatter);
        System.out.println(date4);

        LocalDate newDate = LocalDate.now();
        long days = DateWrapper.getDaysBetweenDates(date1, newDate);
        System.out.println(days);

        MyTemporalAdjuster task2 = new MyTemporalAdjuster(3);
        System.out.println(task2.adjustInto(date));
    }
}
