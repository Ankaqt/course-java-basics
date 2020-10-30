package com.rakovets.course.javabasics.practice.jcf;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoring {
    private Map<String, Integer> map;

    public static void researchText(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = text.split(" ");
        for (String word : arr) {
            if (map.containsKey(word)) {
                int key = map.get(word);
                map.put(word, ++key);
            } else {
                map.put(word, 1);
            }
        }
    }

    public int getCountUniqueWords( HashMap<String, Integer> map) {
        return map.size();
    }

    public java.util.Set<String> getUniqueWords(HashMap<String, Integer> map) {
        return map.keySet();
    }

    public int get(HashMap<String, Integer> map, String word) {
        return map.get(word);
    }
}
