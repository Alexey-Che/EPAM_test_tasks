package com.company.doandlearn.topicone.linear;

public class Task5 {
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = 60 * 60;

    public static void main(String[] args) {

        int time = 23526;
        int hour = time / SECONDS_PER_HOUR;
        System.out.print(hour + "ч ");
        int minutes = (time % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        System.out.print(minutes + "мин ");
        int seconds = (time % SECONDS_PER_HOUR) % SECONDS_PER_MINUTE;
        System.out.println(seconds + "c");
        String result = String.format("%02dч %02dмин %02dс", hour, minutes, seconds);
        System.out.println(result);
    }
}
