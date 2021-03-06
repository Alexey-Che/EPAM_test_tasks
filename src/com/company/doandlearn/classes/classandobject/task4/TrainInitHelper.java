package com.company.doandlearn.classes.classandobject.task4;

import com.company.doandlearn.util.RandomHelper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class TrainInitHelper {

    public static Train[] initTrains(int count) {
        String[] destination = {"Чебаркуль", "Ландан", "Адис-Абеба", "Полюс холода", "Ямайка"};
        Train[] trains = new Train[count];
        for (int i = 0; i <count ; i++) {
            Train s = new Train();
            trains[i] = s;
            s.setDestinationName(destination[RandomHelper.getRandomNumberInRange(0,4)]);
            s.setTrainNumber(i+1);
            s.setDepartureTime(randomDateTimeToday());
        }
        return trains;
    }

    private static LocalDateTime randomDateTimeToday() {
        LocalDateTime midnight =  LocalDate.now().atTime(LocalTime.MIDNIGHT);
        LocalDateTime randomDateTimeToday = midnight.plusHours(new Random().nextInt(11));
        return randomDateTimeToday;
    }
}
