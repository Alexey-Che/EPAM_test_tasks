package com.company.doandlearn.classes.classandobject.task4;

import java.util.Comparator;

public class TrainNumberComparatorDesc implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        return o2.getTrainNumber()-o1.getTrainNumber();
    }
}

