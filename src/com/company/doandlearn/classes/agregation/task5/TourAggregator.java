package com.company.doandlearn.classes.agregation.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TourAggregator {

    private String tourOperator;
    private List<Tour> tours;

    public TourAggregator(String tourOperator) {
        this.tourOperator = tourOperator;
        tours = new ArrayList<>();
    }

    public void addTours(Tour tour) {
        tours.add(tour);
    }

    public List<Tour> selectTour(Transport transport, Food food, int days) {
        ArrayList<Tour> packages = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getTransport().equals(transport)&&tour.getFood().equals(food)
                    &&tour.getNumberOfDays()==days) {
                packages.add(tour);
            }
        }
        return packages;
    }



    public void sortByPrice() {
        tours.sort(Comparator.comparing(Tour::getPrice));
    }

    public void sortByNumberOfDays() {
        tours.sort(Comparator.comparing(Tour::getNumberOfDays));
    }

    public String getTourOperator() {
        return tourOperator;
    }

    public void setTourOperator(String tourOperator) {
        this.tourOperator = tourOperator;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }
}
