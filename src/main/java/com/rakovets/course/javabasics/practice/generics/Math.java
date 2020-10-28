package com.rakovets.course.javabasics.practice.generics;


import java.util.Arrays;

public class Math <T extends Number & Comparable> {

    public T max(T arg1, T arg2, T arg3) {
        if (arg1.compareTo(arg2) >= 0) {
            if (arg1.compareTo(arg3) >= 0) {
                return arg1;
            }
        }
        if (arg2.compareTo(arg1) >= 0) {
            if (arg2.compareTo(arg3) >= 0) {
                return arg2;
            }
        }
        if (arg3.compareTo(arg1) >= 0) {
            if (arg3.compareTo(arg2) >= 0) {
                return arg3;
            }
        }
        return null;
    }

    public T min(T arg1, T arg2, T arg3, T arg4, T arg5) {
        if (arg1.compareTo(arg2) <= 0) {
            if (arg1.compareTo(arg3) <= 0) {
                if (arg1.compareTo(arg4) <= 0) {
                    if (arg1.compareTo(arg5) <= 0) {
                        return arg1;
                    }
                }
            }
        }
        if (arg2.compareTo(arg1) <= 0) {
            if (arg2.compareTo(arg3) <= 0) {
                if (arg2.compareTo(arg4) <= 0) {
                    if (arg2.compareTo(arg5) <= 0) {
                        return arg2;
                    }
                }
            }
        }
        if (arg3.compareTo(arg1) <= 0) {
            if (arg3.compareTo(arg2) <= 0) {
                if (arg3.compareTo(arg4) <= 0) {
                    if (arg3.compareTo(arg5) <= 0) {
                        return arg3;
                    }
                }
            }
        }
        if (arg4.compareTo(arg1) <= 0) {
            if (arg4.compareTo(arg2) <= 0) {
                if (arg4.compareTo(arg3) <= 0) {
                    if (arg4.compareTo(arg5) <= 0) {
                        return arg4;
                    }
                }
            }
        }
        if (arg5.compareTo(arg1) <= 0) {
            if (arg5.compareTo(arg2) <= 0) {
                if (arg5.compareTo(arg3) <= 0) {
                    if (arg5.compareTo(arg4) <= 0) {
                        return arg5;
                    }
                }
            }
        }
        return null;
    }

    public double getAverage(T[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i].doubleValue();
            average /= array.length;
        }
        return average;
    }


    public T getMax(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T getMin(T[] array) {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T[] sort(T[] array) {
        Arrays.sort(array);
        return array;
    }

    public int search(T[] array, T el) {
        return Arrays.binarySearch(array,el);
    }
}
