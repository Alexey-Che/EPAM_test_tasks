package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int k = ReadFromScanner.readOnlyPositiveFromScanner("введите делитель");
        int arrayLenght = ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива");
        List<Integer> mass = new ArrayList<>();
        for (int i = 0; i < arrayLenght; i++) {
            int nextInt = ReadFromScanner.readIntFromScanner("введите элемент массива");
            mass.add(nextInt);
        }
        int sum = 0;
        for (int value : mass) {
            if (value % k == 0) {
                sum += value;
            }
        }
        System.out.println(String.format("Сумма чисел кратных %d равна %d", k, sum));
    }
}
