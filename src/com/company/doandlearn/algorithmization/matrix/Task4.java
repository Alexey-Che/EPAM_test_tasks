package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 k = new Task4();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveEvenFromScanner("set even size");
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < a; j++) {
                    matrix[i][j] = a - j;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
