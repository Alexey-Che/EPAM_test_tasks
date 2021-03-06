package com.company.doandlearn.algorithmization;

public class MatrixHelper {
    public static void printMatrix (int [][] a) {
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.printf("%02d", anInt);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void sortMatrixByLine(int[][] a, boolean ASC) {
        boolean isSorted;
        int swap;
        System.out.println(String.format("Sorting by %s ", ASC ? "ascending" : "descending"));
        for (int i = 0; i < a.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < a[i].length - 1; j++) {
                    boolean condition = ASC ? a[i][j] > a[i][j + 1] : a[i][j] < a[i][j + 1];
                    if (condition) {
                        isSorted = false;
                        swap = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = swap;
                    }
                }
            }
        }
    }

    public static void sortMatrixByColumn(int[][] a, boolean ASC, int m, int n) {
        boolean isSorted;
        int swap;
        System.out.println(String.format("Sorting by %s ", ASC ? "ascending" : "descending"));
        for (int j = 0; j < n; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < m - 1; i++) {
                    boolean condition = ASC ? a[i][j] > a[i + 1][j] : a[i][j] < a[i + 1][j];
                    if (condition) {
                        isSorted = false;
                        swap = a[i][j];
                        a[i][j] = a[i + 1][j];
                        a[i + 1][j] = swap;
                    }
                }
            }
        }
    }
}
