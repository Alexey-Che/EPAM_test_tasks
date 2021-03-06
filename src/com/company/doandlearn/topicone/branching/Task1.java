package com.company.doandlearn.topicone.branching;

public class Task1 {
    public static void main(String[] args) {
        int ab = 56;
        int bc = 34;
        if (ab + bc < 180) {
            System.out.print("Это треугольник ");
            if (ab + bc == 90) {
                System.out.println("- прямоугольный");
            }
        }
    }
}
