package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.algorithmization.MatrixHelper;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task14 {
    public static void main(String[] args) {
        Task14 k = new Task14();
        k.go();
    }

    public void go() {
        int m = ReadFromScanner.readIntFromScanner("set line size");
        int n = ReadFromScanner.readIntFromScanner("set column size");
        int[][] matrix = new int[m][n];
        int count = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (count == j) {
                    matrix[i][j] = 0;
                } else if (count + j + i >= m) {
                    matrix[i][j] = 1;
                } else if (count < j) {
                    matrix[i][j] = Math.random() < 0.5 ? 0 : 1;
                }
                if (matrix[i][j] == 1) {
                    count++;
                }
                //System.out.print(matrix[i][j] +" ");
            }
            //System.out.println();
            count = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
