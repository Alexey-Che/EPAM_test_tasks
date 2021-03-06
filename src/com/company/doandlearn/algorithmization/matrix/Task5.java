package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 k = new Task5();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveEvenFromScanner("set size");
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j + i <= a) {
                    matrix[j - 1][i] = j;
                } else {
                    matrix[j - 1][i] = 0;
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
