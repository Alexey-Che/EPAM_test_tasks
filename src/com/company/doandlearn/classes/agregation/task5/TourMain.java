package com.company.doandlearn.classes.agregation.task5;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class TourMain {

    public static void main(String[] args) {
        TourAggregator vasya = new TourAggregator("Vasya Tour");

        vasya.addTours(new Tour("Italy", "London", TourType.SHOPPING,
                Transport.PLANE, Food.NOT_INCLUDET, 10, 1000.50));
        vasya.addTours(new Tour("Spain", "Barcelona", TourType.TREATMENT,
                Transport.BUS, Food.ALL_INCLUSIVE, 8, 500.80));
        vasya.addTours(new Tour("Italy", "Rome", TourType.EXCURSION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 10, 950.36));
        vasya.addTours(new Tour("Italy", "Venice", TourType.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 20, 1099.91));
        vasya.addTours(new Tour("Italy", "Milan", TourType.SHOPPING,
                Transport.PLANE, Food.BREAKFAST, 3, 399.99));
        vasya.addTours(new Tour("Italy", "Florence", TourType.TREATMENT,
                Transport.TRAIN, Food.ALL_INCLUSIVE, 13, 1099.11));
        vasya.addTours(new Tour("Italy", "Rome", TourType.SHOPPING,
                Transport.CAR, Food.NOT_INCLUDET, 5, 599.50));
        List<Tour> select = vasya.selectTour(Transport.BUS, Food.ALL_INCLUSIVE, 8);
        System.out.println(select);

        TourAggregator2 petya = new TourAggregator2("Petya Tour");

        petya.addTours(new Tour2("Masha", TourType.SHOPPING, LocalDate.of(2014, Month.APRIL, 5),
                LocalDate.of(2014, Month.APRIL, 25)));
        petya.addTours(new Tour2("Masha", TourType.CRUISE, LocalDate.of(2014, Month.FEBRUARY, 15),
                LocalDate.of(2014, Month.JULY , 17)));
        petya.addTours(new Tour2("Misha", TourType.TREATMENT, LocalDate.of(2014, Month.MAY, 4),
                LocalDate.of(2014, Month.JANUARY, 15)));
        petya.addTours(new Tour2("Mosha", TourType.RECREATION, LocalDate.of(2014, Month.FEBRUARY, 1),
                LocalDate.of(2014, Month.AUGUST, 5)));

        List<Tour2> select2 = petya.selectTourOfDay(150);
        System.out.println(select2);
    }
}
