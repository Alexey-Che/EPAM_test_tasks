package com.company.doandlearn.algorithmization.decomposition;

public class Task15 {
    private static void findNumbers (int n) {
        int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(", ");
            number[0]++;
        }
        System.out.println("\b\b"); //удаление последней запятой в строке
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            findNumbers(i);
        }
    }
}
