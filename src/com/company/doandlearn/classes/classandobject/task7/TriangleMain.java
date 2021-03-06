package com.company.doandlearn.classes.classandobject.task7;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = Triangle.createTriangle(new Point(1, 3), new Point(2, 6), new Point(6, 1));
        if (triangle == null) {
            System.out.println("это прямая линия");
        } else {
            System.out.println(String.format("Площадь треугольника = %.02f", triangle.calcAreaOfTriangle()));
            System.out.println("Точка пересечения мередиан : " + triangle.pointMedian());
            System.out.println(String.format("Периметр треугольника = %.02f", triangle.calcPerimeterOfTriangle()));
        }
    }
}
