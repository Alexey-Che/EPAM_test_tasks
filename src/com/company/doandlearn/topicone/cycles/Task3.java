package com.company.doandlearn.topicone.cycles;

public class Task3 {
    static double sum = 0;
    public static void main(String[] args) {
        for (int i =1; i<= 100; i++) {
            sum+= Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
