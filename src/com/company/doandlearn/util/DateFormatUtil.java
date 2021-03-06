package com.company.doandlearn.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatUtil {
    public static final String DATE_FORMAT = "dd.MM.yyyy HH:mm";
    public static final String TIME_FORMAT = "HH:mm";
    public static final String DATE2_FORMAT = "dd.MM.yyyy";


    public static void main(String[] args) {

        //Get current date time
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);
    }

    public static String formatLocalDateTime(LocalDateTime time) {
        return formatLocalDateTime(time, DATE_FORMAT);
    }

    public static String formatLocalDateTime(LocalDateTime time, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return time.format(formatter);
    }

    public static String formatLocalTime(LocalTime time, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formateDateTime = time.format(formatter);
        return formateDateTime;
    }

    public static String formatLocalTime(LocalTime time) {
        return formatLocalTime(time, TIME_FORMAT);
    }

    public static String formatLocalDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formateDate = date.format(formatter);
        return formateDate;
    }

    public static String formatLocalDate(LocalDate date) {
        return formatLocalDate(date, DATE2_FORMAT);
    }
}
