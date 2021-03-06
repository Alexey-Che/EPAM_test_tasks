package com.company.doandlearn.classes.classandobject.task4;

import com.company.doandlearn.topicone.ReadFromScanner;

import java.util.Arrays;

public class Task4Main {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();

        Train[] trains = TrainInitHelper.initTrains(10);
        printTrain(trains);

        int number = ReadFromScanner.readOnlyPositiveFromScanner("enter a number of train");
        Train foundTrain = trainService.findTrain(number, trains);
        printTrain(foundTrain);

        Train[] sortedTrainByNumder = trainService.sortTrainByNumberDesc(trains);
        printTrain(sortedTrainByNumder);
        printTrain(trains);

        trainService.sortTrainByDestination(trains);
        printTrain(trains);
    }

    public static void printTrain(Train train) {
        System.out.println(train);
    }

    public static void printTrain(Train[] trains) {
        System.out.println(Arrays.toString(trains));
    }
}
