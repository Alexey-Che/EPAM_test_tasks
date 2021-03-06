package com.company.doandlearn.classes.classandobject.task4;

import java.util.Arrays;
import java.util.Comparator;

public class TrainService {

    public Train findTrain(int number, Train[] trains) {
        for (Train train:trains) {
            if (train.getTrainNumber()==number) {
                return train;
            }
        }
        return null;
    }

    public Train[] sortTrainByNumberDesc(Train[] trains) {
        Comparator<Train> comparatorDesc = new TrainNumberComparatorDesc();
        Arrays.sort(trains, comparatorDesc);
        return trains;
    }

    public Train[] sortTrainByDestination(Train[] trains) {
        Comparator<Train> comparator = new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                int result = o1.getDestinationName().compareTo(o2.getDestinationName());
                if (result==0) {
                    return o1.getDepartureTime().compareTo(o2.getDepartureTime());
                }
                return result;
            }
        };
        Arrays.sort(trains, comparator);
        return trains;
    }
}
