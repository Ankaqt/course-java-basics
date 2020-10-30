package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;

public class StringCollectionUtil {
    public static ArrayList<String> resetWordsByLength(ArrayList<String> string, int length) {
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == length) {
               string.set(i,"*");
            }
        }
        return string;
    }

    public static ArrayList<String> removeWordsByLength(ArrayList<String> string, int length) {
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == length) {
                string.remove(i);
            }
        }
        return string;
    }
}
