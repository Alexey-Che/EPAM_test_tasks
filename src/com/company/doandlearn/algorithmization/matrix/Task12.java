package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.algorithmization.MatrixHelper;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task12 {
    public static void main(String[] args) {
        Task12 k = new Task12();
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
        MatrixHelper.sortMatrixByLine(matrix, true);
        MatrixHelper.printMatrix(matrix);
        MatrixHelper.sortMatrixByLine(matrix, false);
        MatrixHelper.printMatrix(matrix);
    }
}
