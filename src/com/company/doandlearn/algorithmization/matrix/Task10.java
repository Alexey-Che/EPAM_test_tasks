package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.algorithmization.MatrixHelper;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task10 {
    public static void main(String[] args) {
        Task10 k = new Task10();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("set size");
        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
        MatrixHelper.printMatrix(matrix);
        System.out.print("Положительные элементы главной диагонали: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
