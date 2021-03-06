package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Task3 k = new Task3();
        k.go();
    }

    private void go() {
        int[] mass = SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        int pozitive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                negative++;
            } else if (mass[i] > 0) {
                pozitive++;
            } else {
                zero++;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("колличество положительных элементов " + pozitive);
        System.out.println("количество отрицательных элементов " + negative);
        System.out.println("количество нулевых элементов " + zero);
    }
}
