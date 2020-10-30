package com.rakovets.course.javabasics.practice.jcf.collection;
import com.rakovets.course.javabasics.practice.jcf.SchoolClass;
import com.rakovets.course.javabasics.practice.jcf.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SchoolClassTest {
    @Test
    void schoolClassTest1() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Rty", 19, 9.1));
        students.add(new Student("Bo", "Tyu", 20, 6.58));
        students.add(new Student("Tony", "Jou", 21, 8.5));
        students.add(new Student("Rob", "Nontu", 18, 2.8));
        SchoolClass schoolClass = new SchoolClass(students);
        students.sort(new SchoolClass.StudentAgeComparator());
        assertEquals("18 19 20 21", schoolClass.getAges());
    }

    @Test
    void schoolClassTest2() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Rty", 19, 9.1));
        students.add(new Student("Bo", "Tyu", 20, 6.58));
        students.add(new Student("Tony", "Jou", 21, 8.5));
        students.add(new Student("Rob", "Nontu", 18, 2.8));
        SchoolClass schoolClass = new SchoolClass(students);
        students.sort(new SchoolClass.AverageAnnualMarkComparator());
        assertEquals("2.8 6.58 8.5 9.1", schoolClass.getAverageMarks());
    }
}