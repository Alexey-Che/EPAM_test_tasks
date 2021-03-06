package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 k = new Task3();
        k.go();
    }

    public void go() {
        int a = ReadFromScanner.readOnlyPositiveFromScanner("введите сторону треугольника");

        System.out.println(String.format("hexagon area = %.2f", calcHexagonSquare(calcTriangleSquare(a))));
    }

    public double calcTriangleSquare(int x) {
        return (Math.sqrt(3) / 4) * Math.pow(x, 2);
    }

    public double calcHexagonSquare(double triangleSquare) {
        return triangleSquare*6;
    }
}
