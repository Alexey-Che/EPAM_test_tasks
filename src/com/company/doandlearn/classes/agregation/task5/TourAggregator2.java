package com.company.doandlearn.classes.agregation.task5;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TourAggregator2 {

    private String tourOperator;
    private List<Tour2> tours;

    public TourAggregator2(String tourOperator) {
        this.tourOperator = tourOperator;
        this.tours = new ArrayList<>();
    }

    public List<Tour2> selectTourOfDay(int minimumDays) {
        List<Tour2> result = new ArrayList<>();
        for(Tour2 tour: tours) {
            long daysCurrent = tour.getDateStart().until(tour.getDateEnd(), ChronoUnit.DAYS);
            if(daysCurrent>minimumDays) {
                result.add(tour);
            }
        }
        return result;
    }

    public void addTours(Tour2 tour) {
        tours.add(tour);
    }

    public String getTourOperator() {
        return tourOperator;
    }

    public List<Tour2> getTours() {
        return tours;
    }

    public void setTourOperator(String tourOperator) {
        this.tourOperator = tourOperator;
    }

    public void setTours(List<Tour2> tours) {
        this.tours = tours;
    }
}
