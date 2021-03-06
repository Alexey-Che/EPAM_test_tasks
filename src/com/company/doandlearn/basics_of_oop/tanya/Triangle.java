package com.company.doandlearn.basics_of_oop.tanya;

import java.util.Arrays;
import java.util.List;

public class Triangle extends Shape {
    private Integer a,b,c;

    public Triangle(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public List<Integer> getSides() {

        return Arrays.asList(a, b, c);
    }
}
