package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.*;


public class FileAnalyzeUtil {

    public Collection<String> getListOfStringsOfFile(String filePath) {
        Collection<String> list = new LinkedList<>();
        String str;
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            while ((str = read.readLine()) != null) {
                list.add(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public Collection<String> getListOfWordsStartingWithVowel(String filePath) {
        Collection<String> list = new LinkedList<>();
        String str;
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            while ((str = read.readLine()) != null) {
                if (str.matches("^[aeiouyAEIOUY].*")) {
                    list.add(str);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public Collection<String> getListOFWordsLastLetterMatchesFirst(String filePath) {
        Collection<String> list = new LinkedList<>();
        String str = " ";
        String str1 = " ";
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            while ((str = read.readLine()) != null) {
                if (!str.equals("")) {
                    if (str.charAt(str.length() - 1) == str1.charAt(0)) {
                        list.add(str);
                    }
                }
                str = str1;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public Map<Character, Integer> getFrequencyOfLetters(String filePath) {
        Map<Character, Integer> map = new HashMap<>();
        String str;
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            while ((str = read.readLine()) != null) {
                str = str.toLowerCase();
                str.chars().forEach(e -> map.put((char) e, map.getOrDefault((char) e, 0) + 1));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return map;
    }

    public Map<String, Integer> getFrequencyOfWords(String filePath) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String str;
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            while ((str = read.readLine()) != null) {
                String next = str.toLowerCase();
                if (!wordCounts.containsKey(next)) {
                    wordCounts.put(next, 1);
                } else {
                    wordCounts.put(next, wordCounts.get(next) + 1);

                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        return wordCounts;
    }

    public Map <String,Double> getStudentProgress (String pathFile)  {
        Collection<String> student = this.getListOfStringsOfFile (pathFile);
        Map<String,Double> map = new HashMap<>();
        for (String line: student) {
            String[] words = line.split(",");
            double sum = 0;
            for (int i = 1; i < words.length; i++) {
                try {
                    int mark = Integer.parseInt(words[i]);
                    sum+=mark;
                } catch (NumberFormatException nfe) {
                    System.out.println("NumberFormatException: " + nfe.getMessage());
                }
            }
            Double average = sum / (words.length-1);
            map.put(words[0],average);
        }
        return map;
    }
}