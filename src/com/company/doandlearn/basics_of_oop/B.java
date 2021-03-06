package com.company.doandlearn.basics_of_oop;

public class B extends A {

    public void hello() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A obj = new B();
        //obj.hello();
        System.out.println(obj.toString());
    }
}
