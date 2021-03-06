package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 k = new Task6();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveEvenFromScanner("set size");
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((j >= i && j + i < a) || (j <= i && j + i >= a - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
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
