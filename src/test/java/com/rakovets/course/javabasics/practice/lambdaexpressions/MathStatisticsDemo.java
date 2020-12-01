package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        System.out.println(MathStatistics.getSetOfRandoms());
        List<Integer> numbers = List.of(1, 3, 3, 16, 19, 26, 42, 555);
        System.out.println(numbers);
        System.out.println(MathStatistics.countEven(numbers));
        System.out.println(MathStatistics.countOdd(numbers));
        System.out.println(MathStatistics.countEqual0(numbers));
        System.out.println(MathStatistics.countEqualValue(numbers, 3));
    }
}
