package com.company.doandlearn.algorithmization.matrix;


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Task1 k = new Task1();
        k.go();
    }

    private void go() {
        /*int[][] matrixB = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };*/
        int m = 5; //строки - i
        int n = 10; // столбцы - j
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        //распечатать
        //System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //задача n-1-i
        for (int j = 0; j < n; j++) {
            if (j % 2 != 0) {
                if (matrix[0][j] > matrix[m - 1][j]) {
                    System.out.println("j = " + j);
                    for (int i = 0; i < m; i++) {
                        System.out.println(matrix[i][j]);
                    }
                }
            }
        }
    }
}
