package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.algorithmization.MatrixHelper;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task9 {
    public static void main(String[] args) {
        Task9 k = new Task9();
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
        int line = 0;
        int sum = 0;
        int max = 0;
        MatrixHelper.printMatrix(matrix);
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < a; i++) {
               sum += matrix[i][j];
               if (sum>max) {
                   max = sum;
                   line = i;
               }
            }
            sum = 0;
        }
        System.out.println(String.format("%d столбец содержит максимальную сумму %d", line, max));
    }
}
