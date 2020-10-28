package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairUtilTest {

    @Test
    void swapTest() {
        PairUtil<String, Integer> stringIntegerPairUtil = new PairUtil<>();
        Pair<String, Integer> origin = new Pair<>("qwe", 123);
        Pair<Integer, String> swapped = stringIntegerPairUtil.swap(origin);
        Assertions.assertEquals(origin.getKey(), swapped.getValue());
        Assertions.assertEquals(origin.getValue(),swapped.getKey());
    }
}
