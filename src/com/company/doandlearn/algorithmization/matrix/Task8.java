package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 k = new Task8();
        k.go();
    }

    public void go() {
        int m = ReadFromScanner.readIntFromScanner("set line size");
        int n = ReadFromScanner.readIntFromScanner("set column size");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int k = ReadFromScanner.readIntFromScanner("set column 1");
        int p = ReadFromScanner.readIntFromScanner("set column 2");
        for (int i = 0; i < m; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (j==k) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][p];
                    matrix[i][p] = temp;
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
