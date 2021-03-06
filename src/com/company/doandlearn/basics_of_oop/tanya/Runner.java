package com.company.doandlearn.basics_of_oop.tanya;

public class Runner {

    public static void main(String[] args) {
        Shape triangle = new Triangle(3,5,6);
        Shape square = new Square(5,6);
        System.out.println(triangle.getP());
        System.out.println(square.getP());

    }
}
