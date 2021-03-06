package com.company.doandlearn.classes.classandobject.task3;

public class Task3Main {

    public static void main(String[] args) {
        Student[] students = StudentInitHelper.initStudents(10);
        StudentService studentService = new StudentService();
        studentService.printGoodStudent(students);
    }
}
