package com.company.doandlearn.topicone.linear;

public class Taks4 {
    public static void main(String[] args) {
        double r = 537.986;
        int d = (int) r;
        double e = (double) d;
        double n = (r * 1000) % 1000;
        double w = e / 1000;
        double result = w + n;


        System.out.println(n);
        System.out.println(d);
        System.out.println(w);
        System.out.println(result);

        double initial = 537.986;
        System.out.println("initial: " + initial);
        double fractionalPart = (initial * 1000) % 1000; //986.0
        System.out.println("fractionalPart: " + fractionalPart);
        int intPart = (int) initial; //537
        System.out.println("intPart: " + intPart);
        double intPartAsFrac = (double)intPart/1000; //0.537
        System.out.println("intPartAsFrac: " + intPartAsFrac);

        double resulted = fractionalPart + intPartAsFrac;
        System.out.println("result: " + resulted);

    }
}
