package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Task8 k = new Task8();
        k.go();
    }

    private void go() {
        int[] mass = /*{1, 2, 2, 3, 2, 4, 5, 67, 7, 8, 90, 0, 0, 0, 1, 0, 0, 2, 2, 2}*/SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        int min = mass[0];
        int count = 1;
        for (int d : mass) {
            if (d < min) {
                min = d;
                count = 1;
            } else if (d == min) {
                count++;
            }
        }
        System.out.println(String.format("%d минимальный элемент %d их количество", min, count));
        System.out.println(Arrays.toString(mass));
        int[] newMass = new int[mass.length - count];
        int indexMass = 0;
        for (int d : mass) {
            if (d != min) {
                newMass[indexMass++] = d;
                /*indexMass++;*/
            }
        }
        System.out.println(Arrays.toString(newMass));
    }
}
