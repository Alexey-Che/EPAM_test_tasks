package com.company.doandlearn.classes.classandobject.task3;

import com.company.doandlearn.util.RandomHelper;


public class StudentInitHelper {

    public static Student[] initStudents(int count) {
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            Student s = new Student();
            students[i] = s;
            s.setGroup(getRandomGroup());
            s.setName("Tasiana" + i);
            s.setPerformance(getRandomPerfomance());
        }
        students[count - 1].setPerformance(getRandomPerfomance(9, 10));
        return students;
    }

    private static String getRandomGroup() {
        int random = (int) (Math.random() * 50);
        return String.valueOf(random);
    }

    private static int[] getRandomPerfomance() {
        return getRandomPerfomance(8, 10);
    }

    private static int[] getRandomPerfomance(int min, int max) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = RandomHelper.getRandomNumberInRange(min, max);
        }
        return a;
    }
}
