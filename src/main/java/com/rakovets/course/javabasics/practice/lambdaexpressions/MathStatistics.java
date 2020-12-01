package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MathStatistics {
    public static List<Integer> getSetOfRandoms() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listSize = random.nextInt();
        for (int i = 1; i <= listSize; i++) {
            int number = random.nextInt();
            list.add(number);
        }
        return list;
    }

    public static long countEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
    }

    public static long countOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .count();
    }

    public static long countEqual0(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number == 0)
                .count();
    }

    public static long countEqualValue(List<Integer> numbers, int value) {
        return numbers.stream()
                .filter(number -> number == value)
                .count();
    }
}
