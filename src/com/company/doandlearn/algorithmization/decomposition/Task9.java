package com.company.doandlearn.algorithmization.decomposition;

import com.company.doandlearn.topicone.ReadFromScanner;

public class Task9 {
    public static void main(String[] args) {
        Task9 k = new Task9();
        k.go();
    }

    public void go() {
        int x = ReadFromScanner.readOnlyPositiveFromScanner("enter X side size");
        int y = ReadFromScanner.readOnlyPositiveFromScanner("enter Y side size");
        int z = ReadFromScanner.readOnlyPositiveFromScanner("enter Z side size");
        int t = ReadFromScanner.readOnlyPositiveFromScanner("enter T side size");
        double xy = calcHypotenuse(x, y);
        double p = calcHalfOfMeterTriangle(xy, z, t);
        double xyArea = calcPythagorasTriangleSquare(x, y);
        double xyztArea = calcHeronTriangleSquare(p, xy, z, t) + xyArea;
        System.out.println("Площадь четырехугольника = " + xyztArea);
    }

    public double calcPythagorasTriangleSquare(int x, int y) {
        return (x * y / 2);
    }

    public double calcHeronTriangleSquare(double p, double a, int b, int c) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calcHypotenuse(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double calcHalfOfMeterTriangle(double a, int b, int c) {
        return (a + b + c) / 2;
    }
}
