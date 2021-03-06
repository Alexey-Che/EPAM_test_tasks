package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 k = new Task2();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readIntFromScanner("set size");
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == a - 1 - i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
