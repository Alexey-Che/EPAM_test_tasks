package com.company.doandlearn.algorithmization;

import java.lang.Math;
import java.util.ArrayList;

public class SetSequence {
    public static int[] randomSequencePozitive(int value) {
        int[] k = new int[value];
        for (int i = 0; i<value; i++) {
            k[i] = (int) (Math.random()*100);
        }
        return k;
    }

    public static int[] randomSequence(int value) {
        int[] k = new int[value];
        for (int i = 0; i<value; i++) {
            k[i] = (int) (Math.random()*200-100);
        }
        return k;
    }

    public static ArrayList<Integer> randomArraySequence(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<value; i++) {
            list.add((int)(Math.random()*200-100));
        }
        return list;
    }
}
