package com.company.doandlearn.basics_of_oop.tanya;

import java.util.List;

public abstract class Shape {
    public abstract List<Integer> getSides();
    public Integer getP() {
        List<Integer> sides = getSides();
        return sides.stream().mapToInt(Integer::intValue).sum();
    }
}
