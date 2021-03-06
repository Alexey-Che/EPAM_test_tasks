package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 k = new Task3();
        k.go();
    }

    public void go() {
        int m = ReadFromScanner.readIntFromScanner("set line size");
        int n = ReadFromScanner.readIntFromScanner("set column size");
        int k = ReadFromScanner.readIntFromScanner("set line");
        int p = ReadFromScanner.readIntFromScanner("set column");
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k - 1 || j == p - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
