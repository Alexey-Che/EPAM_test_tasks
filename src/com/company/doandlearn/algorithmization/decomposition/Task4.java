package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.algorithmization.MatrixHelper;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 k = new Task4();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("введите количество точек");
        int[][] point = new int[2][a];
        int x = 0;
        int y = 1;
        System.out.println(point[0].length);
        for (int j = 0; j < point[y].length; j++) {
            point[x][j] = (int) (Math.random() * 50);
            point[y][j] = (int) (Math.random() * 50);
        }
        MatrixHelper.printMatrix(point);
        MaxDistanceResult result = calcMaxDistance(point);
        printMaxDistanceResult(result, point);
    }

    public MaxDistanceResult calcMaxDistance(int[][] a) {
        double max = 0;
        int x1y1 = 0;
        int x2y2 = 0;
        for (int i = 0; i < a[1].length - 1; i++) {
            for (int j = i + 1; j < a[1].length; j++) {
                double distance = calcDistance(a[0][i], a[1][i], a[0][j], a[1][j]);
                if (distance > max) {
                    max = distance;
                    x1y1 = i;
                    x2y2 = j;
                }//Math.sqrt(Math.pow(a[0][j] - a[0][i], 2) + Math.pow(a[1][j] - a[1][i], 2))
            }
        }
        return new MaxDistanceResult(max, x1y1, x2y2);
    }

    public double calcDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void printMaxDistanceResult(MaxDistanceResult maxDistanceResult, int[][] a) {
        int x1 = a[0][maxDistanceResult.getX1y1()];
        int y1 = a[1][maxDistanceResult.getX1y1()];
        int x2 = a[0][maxDistanceResult.getX2y2()];
        int y2 = a[1][maxDistanceResult.getX2y2()];
        double l = maxDistanceResult.getMax();
        System.out.println(String.format("Max = %.2f between (%d, %d) and (%d, %d)", l, x1, y1, x2, y2));
    }

    public class MaxDistanceResult {
        private double max;
        private int x1y1;
        private int x2y2;

        public MaxDistanceResult(double max, int x1y1, int x2y2) {
            this.max = max;
            this.x1y1 = x1y1;
            this.x2y2 = x2y2;
        }

        public double getMax() {
            return max;
        }

        public int getX1y1() {
            return x1y1;
        }

        public int getX2y2() {
            return x2y2;
        }
    }
}
