package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 k = new Task6();
        k.go();
    }

    private void go() {
        int[] mass = SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        int sum = 0;
        for (int i=0;i<mass.length;i++) {
            if (isSimple(i)) {
                sum+=mass[i];
                System.out.println(i);
            }
        }
        System.out.println("сумма чисел простых индексов" + sum);
    }

    private boolean isSimple(int a) {
        if (a <= 0) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
