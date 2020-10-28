package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    void getMax() {
        Math<Double> getMaxDouble = new Math();
        Assertions.assertEquals(5.131, getMaxDouble.max(1.441, 1.0, 5.131));
        Assertions.assertEquals(3.8, getMaxDouble.max(2.111, 3.8, 2.245));
        Assertions.assertEquals(9.55, getMaxDouble.max(4.11, 3.63, 9.55));
    }

    @Test
    void  getMin() {
        Math<Integer> getMinInteger = new Math();
        Assertions.assertEquals(5, getMinInteger.min(8, 6, 5, 9, 10));
        Assertions.assertEquals(3, getMinInteger.min(4, 3, 5, 17, 19));
        Assertions.assertEquals(1, getMinInteger.min(4, 1, 9, 88, 99));
    }

    @Test
    void getAverage() {
        Math<Double> getAverageDouble = new Math();
        Double[] array = {10.0,10.0,10.0};
        Assertions.assertEquals(10.0,getAverageDouble.getAverage(array));
    }

    @Test
    void getMaxFromArray() {
        Math<Double> getMaxFromArrayDouble = new Math();
        Double[] array = {10.1, 10.2, 10.3};
        Assertions.assertEquals(10.3,getMaxFromArrayDouble.getMax(array));
    }

    @Test
    void getMinFromArray() {
        Math<Integer> getMinFromArrayInteger = new Math();
        Integer[] array = {10, 11, 12};
        Assertions.assertEquals(10,getMinFromArrayInteger.getMin(array));
    }

    @Test
    void getSorted() {
        Double[] array1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        Math<Double> getSortedDouble = new Math();
        Integer[] array2 = {1, 2, 3, 4, 5};
        Math<Integer> getSortedInteger = new Math();
        Assertions.assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, getSortedDouble.sort(array1));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, getSortedInteger.sort(array2));
    }

    @Test
    void getSearch() {
        Double[] array1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        Math<Double> getSearchDouble = new Math();
        Assertions.assertArrayEquals(1,getSearchDouble.search(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0},2.0));
    }
}
