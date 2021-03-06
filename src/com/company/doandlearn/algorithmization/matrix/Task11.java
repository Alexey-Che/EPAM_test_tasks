package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.algorithmization.MatrixHelper;

public class Task11 {
    public static void main(String[] args) {
        Task11 k = new Task11();
        k.go();
    }

    public void go() {
        int m = 10;
        int n = 20;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }
        MatrixHelper.printMatrix(matrix);
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count>= 3) {
                System.out.println("В строке " + i + " число 5 встречается " + count + " раз");
            }
            count = 0;
        }
    }
}
