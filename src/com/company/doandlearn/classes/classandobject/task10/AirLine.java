package com.company.doandlearn.classes.classandobject.task10;

import com.company.doandlearn.util.DateFormatUtil;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class AirLine {
    private String destination;
    private String flightNumber;
    private String planeType;
    private LocalTime departureTime;
    private List<DayOfWeek> dayOfWeeks;

    public AirLine(String destination, String flightNumber, String planeType, LocalTime departureTime, List<DayOfWeek> dayOfWeeks) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeeks = dayOfWeeks;
    }

    public AirLine() {
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public List<DayOfWeek> getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayOfWeeks(List<DayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime=" + DateFormatUtil.formatLocalTime(departureTime) +
                ", dayOfWeeks=" + dayOfWeeks +
                '}';
    }
}
