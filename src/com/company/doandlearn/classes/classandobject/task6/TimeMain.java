package com.company.doandlearn.classes.classandobject.task6;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(15, 54, 1);
        /*System.out.println(time);
        time.changeHour(-2);
        System.out.println(time);
        time.changeMinutes(-175);
        System.out.println(time);
        time.changeSeconds(59);
        System.out.println(time);*/
        System.out.println(time);
        /*time.changeSeconds(61);
        System.out.println(time);
        time.changeMinutes(-175);
        System.out.println(time);*/
        time.changeSecondsV3(59);
        System.out.println(time);
        time.changeMinutesV3(-174);
        System.out.println(time);

    }
}
