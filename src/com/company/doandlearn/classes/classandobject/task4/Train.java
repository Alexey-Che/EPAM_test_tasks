package com.company.doandlearn.classes.classandobject.task4;

import com.company.doandlearn.util.DateFormatUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Train {
    private String destinationName;
    private int trainNumber;
    private LocalDateTime departureTime;



    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "\b\b Train{" +
                "destinationName = '" + destinationName + '\'' +
                ", trainNumber = " + trainNumber +
                ", departureTime = " + DateFormatUtil.formatLocalDateTime(departureTime) +
                '}'+"\n";
    }
}
