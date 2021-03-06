package com.company.doandlearn.topicone.linear;

public class Task2 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        double z = (b + Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);

        System.out.println("z = " + z);
    }
}
