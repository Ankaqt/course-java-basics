package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double average = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                average += marks[i][j];
            }
        }
        int count = marks.length * marks[0].length;
        double averageMark = average / count;
        BigDecimal bd = new BigDecimal(Double.toString(averageMark));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        averageMark = bd.doubleValue();
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int minMark = marks [0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
              if (minMark > marks[i][j]) {
                  minMark = marks [i][j];
              }

            }

        }
        return minMark;
    }

    /**
     * Возвращает максимальну отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int maxMark = marks [0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (maxMark < marks[i][j]) {
                   maxMark = marks [i][j];
                }
            }
        }
        return maxMark;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}