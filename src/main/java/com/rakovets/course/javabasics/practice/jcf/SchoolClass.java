package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Comparator;

public class SchoolClass {
    private ArrayList<Student> schoolClass;

    public SchoolClass(ArrayList<Student> schoolClass) {
        this.schoolClass = schoolClass;
    }

    public ArrayList<Student> getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(ArrayList<Student> schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Student getBestStudent(SchoolClass schoolClass) {
        this.schoolClass.sort(new AverageAnnualMarkComparator());
        return this.schoolClass.get(0);
    }

    public static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    public static class AverageAnnualMarkComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
        }
    }

    public class NameAndSurnameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            var result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                return o1.getSurname().compareTo(o2.getSurname());
            } else {
                return result;
            }
        }
    }

    public String getAverageMarks() {
        String result = "";
        for (Student student : schoolClass) {
            result += student.getAverageAnnualMark() + " ";
        }
        return result.trim();
    }

    public String getAges() {
        String result = "";
        for (Student student : schoolClass) {
            result += student.getAge() + " ";
        }
        return result.trim();
    }
}
