package com.company.doandlearn.basics_of_oop.tanya;

import java.util.ArrayList;
import java.util.List;

public class Square extends Shape{
    private Integer a;
    private Integer b;

    public Square(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public List<Integer> getSides() {
        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(a);
        result.add(b);
        result.add(b);
        return result;
    }
}
