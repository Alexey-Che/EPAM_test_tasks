package com.company.doandlearn.basics_of_oop.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Calendar {

    private List<Holiday> holidays;
    private int year;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
        fillWeekend(year);
        //TODO: create holiday for saturday and sunday
    }

    public void fillWeekend(int year) {
        LocalDate currentDate = LocalDate.of(year, 1, 1);
        while (currentDate.getYear()!= year+1) {
            if (currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                Holiday h = new Holiday(currentDate, true, "Weekend");
                addHoliday(h);
            }
            if (currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                addHoliday(new Holiday(currentDate, true, "Weekend"));
                currentDate = currentDate.plusDays(4);
            }
            currentDate = currentDate.plusDays(1);
        }
    }

    public void sortByDate() {
        holidays.sort(Comparator.comparing(Holiday::getDate));
    }

    public void sortByDateV2() {
        Comparator<Holiday> holidayComparator = new Comparator<Holiday>() {
            @Override
            public int compare(Holiday o1, Holiday o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        };
        //holidays.sort(holidayComparator);
        Collections.sort(holidays,holidayComparator);
    }

    public List<Holiday> getHolidays() {
        //TODO sortByDate
        return holidays;
    }

    public void addHoliday(Holiday holiday) {
        this.holidays.add(holiday);
    }

    static public class Holiday {

        private LocalDate date;
        private boolean isWeekend;
        private String name;

        private Holiday(LocalDate date, boolean isWeekend, String name) {
            this.date = date;
            this.isWeekend = isWeekend;
            this.name = name;
        }

        public Holiday(LocalDate date, String name) {
            this.date = date;
            this.name = name;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "\b\b" + date + " " + date.getDayOfWeek()+ " " + name + "\n";
        }
    }
}
