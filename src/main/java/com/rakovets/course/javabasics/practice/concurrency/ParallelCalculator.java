package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class ParallelCalculator {
    public static int[] getMaxElement(List<int[]> array) {
        int[] max = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            int[] next = array.get(i);
            sort(next);
            int a = next.length - 1;
            int b = next[a];
            max[i] = b;
        }
        return max;
    }

    public static List<int[]> random() {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < (Math.random() * 50); i++) {
            int[] arr = new int[(int) (Math.random() * 1000000)];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (int) Math.random() * 300;
            }
            list.add(arr);
        }
        return list;
    }


}
