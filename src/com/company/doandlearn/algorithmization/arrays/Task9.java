package com.company.doandlearn.algorithmization.arrays;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

public class Task9 {
    public static void main(String[] args) {
        Task9 k = new Task9();
        k.go();
    }

    private void go() {
        int[] mass = /*{1, 2, 2, 3, 2, 4, 5, 67, 7, 8, 90, 0, 0, 0, 1, 0, 0, 2, 2, 2}*/SetSequence.randomSequence(ReadFromScanner.readOnlyPositiveFromScanner("введите длину массива"));
        int min = mass[0];
        int countResult = 0;
        for (int d : mass) {
            int countD = 0;
            for (int m : mass) {
                if (d==m) {
                    countD++;
                }
            }
            if (countResult<countD) {
                countResult=countD;
                min = d;
            } else if (countResult==countD) {
                min = Math.min(min,d);
            }
        }
        System.out.println(String.format("минимальное число %d встречается %d раз", min, countResult));
    }
}
