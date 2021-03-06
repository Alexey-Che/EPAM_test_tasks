package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.algorithmization.MatrixHelper;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task13 {
    public static void main(String[] args) {
        Task13 k = new Task13();
        k.go();
    }

    public void go() {
        int m = ReadFromScanner.readIntFromScanner("set line size");
        int n = ReadFromScanner.readIntFromScanner("set column size");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
        MatrixHelper.printMatrix(matrix);
        MatrixHelper.sortMatrixByColumn(matrix, true, m, n);
        MatrixHelper.printMatrix(matrix);
        MatrixHelper.sortMatrixByColumn(matrix, false, m, n);
        MatrixHelper.printMatrix(matrix);
    }
}
