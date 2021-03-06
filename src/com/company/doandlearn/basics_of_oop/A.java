package com.company.doandlearn.basics_of_oop;

public class A {

    public void hello() {
        System.out.println("A");
    }

    @Override
    public String toString() {
        hello();
        return "A{}";
    }
}
