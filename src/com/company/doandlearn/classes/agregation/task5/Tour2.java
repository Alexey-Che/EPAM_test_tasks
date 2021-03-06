package com.company.doandlearn.classes.agregation.task5;

import com.company.doandlearn.util.DateFormatUtil;

import java.time.LocalDate;


public class Tour2 {

    private String name;
    private TourType type;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public Tour2(String name, TourType type, LocalDate dateStart, LocalDate dateEnd) {
        this.name = name;
        this.type = type;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public String getName() {
        return name;
    }

    public TourType getType() {
        return type;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(TourType type) {
        this.type = type;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Tour2{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", dateStart=" + DateFormatUtil.formatLocalDate(dateStart) +
                ", dateEnd=" + DateFormatUtil.formatLocalDate(dateEnd) +
                '}';
    }
}
