package com.company.doandlearn.topicone.cycles;

public class Task5 {
    static private double result = 0;
    public static void main(String[] args) {
        int start = 5;
        int end = 7;
        int point = 6;
        for (int i =start; i <= end; i++) {
            if (Math.abs(i)>= point) {
                result+= 1/Math.pow(2,i)+1/Math.pow(3,i);
            }
        }
        System.out.println("Сумма = " + result);
    }
}
