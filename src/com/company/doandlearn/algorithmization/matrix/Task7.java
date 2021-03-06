package com.company.doandlearn.algorithmization.matrix;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 k = new Task7();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("set size");
        double[][] matrix = new double[a][a];
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = Math.sin((Math.pow(i,2)-Math.pow(j,2))/a);
                if (matrix[i][j]>0) {
                    count++;
                }
            }
        }
        System.out.println("количество положительных элементов " + count);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("%.2f", matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
