package com.company.doandlearn.algorithmization.sorting;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        Task6 k = new Task6();
        k.go();
    }

    public void go() {
        int n = ReadFromScanner.readIntFromScanner("set sequence size");
        int[] a = SetSequence.randomSequencePozitive(n);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; )
        {
            if (a[i] > a[i + 1])
            {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                if (i != 0) i--;
            }
            else if (i != a.length - 1) i++;
        }
        System.out.println(Arrays.toString(a));
    }
}
