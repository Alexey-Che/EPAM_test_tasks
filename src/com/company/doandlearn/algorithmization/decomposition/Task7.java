package com.company.doandlearn.algorithmization.decomposition;

public class Task7 {
    public static void main(String[] args) {
        Task7 k = new Task7();
        k.go();
    }

    public void go() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sum += calcFactorial(i);
            }
        }
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 = " + sum);
    }

    public int calcFactorial(int a) {
        /*int f = 1;
        for (int i = 1; i < a; i++) {
            f *= i;
        }*/
        int f = 1;
        if (a==0 || a==1) {
            return f;
        } else {
            f = a* calcFactorial(a-1);
        }
        return f;
    }
}
