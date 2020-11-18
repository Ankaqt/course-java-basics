package com.rakovets.course.javabasics.practice.javaio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.File;


public class FileAnalyzeUtilTest {
    private static String path = "src" + File.separator + "test" + File.separator + "java" + File.separator + "com" + File.separator + "rakovets" + File.separator + "course" + File.separator + "javabasics" + File.separator + "practice" + File.separator + "javaio";

    @Test
    void getListOfStringsOfFileTest() {
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        String filePath = path + File.separator + "Task2";
        LinkedList<String> test = (LinkedList<String>) fileWorker.getListOfStringsOfFile(filePath);
        Assertions.assertEquals("Black bird", test.get(0));
        Assertions.assertEquals("black moon", test.get(1));
    }

    @Test
    void getListOfWordsStartingWithVowelTest() {
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        String filePath = path + File.separator + "Task3";
        LinkedList<String> test = (LinkedList<String>) fileWorker.getListOfWordsStartingWithVowel(filePath);
        Assertions.assertEquals("everything", test.get(0));
        Assertions.assertEquals("everything", test.get(1));
    }

    @Test
    void getListOFWordsLastLetterMatchesFirstTest() {
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        String filePath = path + File.separator + "Task4";
        LinkedList<String> test = (LinkedList<String>) fileWorker.getListOFWordsLastLetterMatchesFirst(filePath);
        Assertions.assertEquals("young", test.get(1));
    }

    @Test
    void getFrequencyOfLettersTest() {
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        String filePath = path + File.separator + "Task6";
        Map<Character, Integer> test = fileWorker.getFrequencyOfLetters(filePath);
        Assertions.assertEquals(4, test.get('a'));
        Assertions.assertEquals(3, test.get('s'));
    }

    @Test
    void getFrequencyOfWordsTest() {
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        String filePath = path + File.separator + "Task7";
        HashMap<String, Integer> test = (HashMap<String, Integer>) fileWorker.getFrequencyOfWords(filePath);
        Assertions.assertEquals(4, test.get('a'));

    }

    @Test
    void testStudentProgressTest() {
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        String pathFile = path + File.separator + "Task9";
        Map<String, Double> test = fileWorker.getStudentProgress(pathFile);
        Assertions.assertEquals(7.5 , test.get("John"));
        Assertions.assertEquals(4.5 , test.get("Erika"));
    }
}


