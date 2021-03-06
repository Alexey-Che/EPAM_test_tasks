package com.company.doandlearn.classes.classandobject.task3;

public class StudentService {

    public void printGoodStudent(Student[] students) {
        for (Student student : students) {
            if (isGood(student)) {
                System.out.println(student);
            }
        }
    }

    public boolean isGood(Student student) {
        int[] perfomance = student.getPerformance();
        for (int p: perfomance) {
            if (p<9) {
                return false;
            }
        }
        return true;
    }
}
