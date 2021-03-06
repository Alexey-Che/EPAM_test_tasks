package com.company.doandlearn.classes.classandobject.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public class AirLineMain {

    public static void main(String[] args) {

        AirLineService service = new AirLineService();

        List<AirLine> airLineList = service.getAirLinesByDayOfWeek(DayOfWeek.WEDNESDAY);
        printList(airLineList);
        List<AirLine> airLineListDestination = service.getAirLinesByDestinationV8("Riga (CRL)");
        printList(airLineListDestination);
        List<AirLine> airLineListDayByWeekAfterSetHour = service.getAirLinesByDayOfWeekAfterSetTimeV8(DayOfWeek.THURSDAY, LocalTime.of(16,00));
        printList(airLineListDayByWeekAfterSetHour);



    }

    public static void printList(List<AirLine> list) {
        list.forEach(System.out::println);
        System.out.println("\n");
    }
}
