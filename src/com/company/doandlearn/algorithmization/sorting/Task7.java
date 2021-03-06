package com.company.doandlearn.algorithmization.sorting;

import com.company.doandlearn.algorithmization.SetSequence;
import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        Task7 k = new Task7();
        k.go();
    }

    public void go() {
        int m = ReadFromScanner.readIntFromScanner("set a Sequence size");
        int n = ReadFromScanner.readIntFromScanner("set b Sequence size");
        int[] a = SetSequence.randomSequencePozitive(m);
        int[] b = SetSequence.randomSequencePozitive(n);
        List<Integer> listOfIndex = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}
