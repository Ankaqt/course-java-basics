package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    void getConcat() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("HelloDima", stringUtil.getConcat("Hello", "Dima"));
        Assertions.assertEquals("HELLODIMA", stringUtil.getConcat("HELLO", "DIMA"));
        Assertions.assertEquals("Hello123Dima", stringUtil.getConcat("Hello123", "Dima"));
        Assertions.assertEquals("Hello123Dima_", stringUtil.getConcat("Hello123", "Dima_"));
    }
    @Test
    void getIndex() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(2, stringUtil.getIndex("Hello", "l"));
        Assertions.assertEquals(-1, stringUtil.getIndex("cat", "d"));
        Assertions.assertEquals(6, stringUtil.getIndex("HELLO Dima", "D"));
    }
    @Test
    void getEquals() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(false, stringUtil.getEquals("1cat", "dog"));
        Assertions.assertEquals(true, stringUtil.getEquals("cat", "cat"));
        Assertions.assertEquals(false, stringUtil.getEquals("CAT", "cat"));
        Assertions.assertEquals(false, stringUtil.getEquals("_cat", "cat"));
    }
    @Test
    void getUpperAndTrim() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("ВОИНЫ СВЕТА, ВОИНЫ ДОБРА", stringUtil.getUpperAndTrim(" воины света, воины добра "));
        Assertions.assertEquals("_ОХРАНЯЮТ ЛЕТО, БЬЮТСЯ ДО УТРА_", stringUtil.getUpperAndTrim("  _охраняют лето, бьются до утра_  "));
        Assertions.assertEquals("ВОИНЫ ДОБРА! ВОИНЫ СВЕТА!", stringUtil.getUpperAndTrim("   Воины добра! Воины света!   "));
    }
    @Test
    void getSubstring() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("ll prevail.The perpetra", stringUtil.getSubstring("Justice will prevail.The perpetrators will be punished."));
        Assertions.assertEquals("род! Это наш город!", stringUtil.getSubstring("Это наш город! Это наш город!"));
        Assertions.assertEquals("<10", stringUtil.getSubstring("123456"));
    }
    @Test
    void getReplace() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(":)", stringUtil.getReplace(":("));
        Assertions.assertEquals("Dima top :)", stringUtil.getReplace("Dima top :("));
        Assertions.assertEquals("DIMA TOP     :)", stringUtil.getReplace("DIMA TOP     :("));
    }
    @Test
    void getStartEnd() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(false, stringUtil.getStartEnd("we will win","win"));
        Assertions.assertEquals(false, stringUtil.getStartEnd("we will win","we"));
        Assertions.assertEquals(false, stringUtil.getStartEnd( "we will win","will"));
    }
    @Test
    void getCountVowels() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(7, stringUtil.getCountVowels("anaaaaaa"));
        Assertions.assertEquals(7, stringUtil.getCountVowels("ANAAAAAA"));
        Assertions.assertEquals(2, stringUtil.getCountVowels("DIMA"));
    }
    @Test
    void getCountSigns() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(2, stringUtil.getCountSigns("a,naa,aaaa"));
        Assertions.assertEquals(1, stringUtil.getCountSigns("ANAAAAAA!"));
        Assertions.assertEquals(3, stringUtil.getCountSigns("D.I.M.A"));
    }
    @Test
    void getReverse() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("LOL", stringUtil.getRevers("LOL"));
        Assertions.assertEquals("kek", stringUtil.getRevers("kek"));
        Assertions.assertEquals("tenet", stringUtil.getRevers("tenet"));
    }
    @Test
    void getCountWords() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals(3, stringUtil.getCountWords("Never  say  never"));
        Assertions.assertEquals(3, stringUtil.getCountWords("Now or never!"));
        Assertions.assertEquals(6, stringUtil.getCountWords("Life is a series of choices."));
    }
    @Test
    void getFullName() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("K.A.A.", stringUtil.getFullName("Khramkova  Anna  Andreevna"));
        Assertions.assertEquals("K.A.A.", stringUtil.getFullName("khramkova  anna  andreevna"));
    }
    @Test
    void getStringOfNumbers() {
        StringUtil stringUtil = new StringUtil();
        Assertions.assertEquals("1110124", stringUtil.getStringOfNumbers( "11q 10d 12g 4ffs"));
        Assertions.assertEquals("123123123", stringUtil.getStringOfNumbers("123a 123a 123"));
    }
}