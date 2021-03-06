package com.company.doandlearn.basics_of_oop.task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalendarMain {

    public static void main(String[] args) {
        int year = 2020;
        Calendar calendar = new Calendar(year);


        //TODO add Holidays Without Boolean
        //TODO* do not init calendar for the same year
        System.out.println(calendar.getHolidays().size());
        Calendar.Holiday march8 = new Calendar.Holiday(LocalDate.of(year, 3, 8),
                "8 march ");
        calendar.addHoliday(march8);
        calendar.addHoliday(new Calendar.Holiday(LocalDate.of(year, 1, 7),
                "Christmas"));
        //System.out.println(calendar.getHolidays());
        calendar.sortByDate();
        //System.out.println(calendar.getHolidays());
        List<Calendar.Holiday> holidays = calendar.getHolidays();
        /*Map<LocalDate, Calendar.Holiday> holidaysByDay = holidays.stream().collect(
                Collectors.toMap(Calendar.Holiday::getDate, Function.identity())
        );*/

        Map<LocalDate, List<Calendar.Holiday>> holidayByTanya = new HashMap<>();

        /*for(Calendar.Holiday holiday: holidays) {
            LocalDate key = holiday.getDate();

            if (holidayByTanya.containsKey(key)) {
                List<Calendar.Holiday> k = holidayByTanya.get(key);
                k.add(holiday);
            } else {
                List<Calendar.Holiday> result = new ArrayList<>();
                result.add(holiday);
                holidayByTanya.put(holiday.getDate(), result );
            }
        }*/

        for(Calendar.Holiday holiday: holidays) {
            LocalDate key = holiday.getDate();
            List<Calendar.Holiday> result = holidayByTanya.get(key);
            if (result==null) {
                result = new ArrayList<>();
            }
            result.add(holiday);
            holidayByTanya.put(key,result);
        }

        System.out.println(holidayByTanya.get(march8.getDate()));

        /*for(Map.Entry<LocalDate, List<Calendar.Holiday>> entry: holidayByTanya.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

    }
}
