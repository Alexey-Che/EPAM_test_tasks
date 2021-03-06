package com.company.doandlearn.topicone.cycles;

import java.math.BigInteger;

public class Task4 {
    /*static long sum = 1;*/
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ONE;
        for (int i =1; i<= 200; i++) {
            /*sum*= Math.pow(i,2);*/
            sum= sum.multiply(BigInteger.valueOf((long)Math.pow(i,2)));
        }
        System.out.println(sum);
    }
}
