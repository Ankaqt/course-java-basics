package com.rakovets.course.javabasics.practice.jcf.list;
import com.rakovets.course.javabasics.practice.jcf.StringCollectionUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StringCollectionUtilTest {
    @Test
    void stringCollectionUtilTest1() {
        ArrayList<String> list = new ArrayList<>();
        String[] str1 = new String[]{"a", "day", "without", "laughter", "is", "a", "day", "wasted"};
        String[] str2 = new String[]{"a", "*", "without", "laughter", "is", "a", "*", "wasted"};

        for (String string : str1) {
            list.add(string);
        }
        StringCollectionUtil.resetWordsByLength(list, 3);
        assertArrayEquals(str2, list.toArray());
    }
    @Test
    void stringCollectionUtilTest2() {
        ArrayList<String> list = new ArrayList<>();
        String[] str1 = new String[]{"a", "day", "without", "laughter", "is", "a", "day", "wasted"};
        String[] str2 = new String[]{"a", "without", "laughter", "is", "a", "wasted"};

        for (String string : str1) {
            list.add(string);
        }
        StringCollectionUtil.removeWordsByLength(list, 3);
        assertArrayEquals(str2, list.toArray());
    }
}

