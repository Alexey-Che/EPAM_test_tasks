package com.company.doandlearn.classes.classandobject.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class
AirLineService {
    private static final List<AirLine> airLines;

    static {
        List<DayOfWeek> everyDay = Arrays.asList(DayOfWeek.MONDAY,DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,DayOfWeek.THURSDAY,DayOfWeek.FRIDAY,DayOfWeek.SATURDAY,DayOfWeek.SUNDAY);
        airLines = new ArrayList<>();
        airLines.add(new AirLine("Paris (SXF)", "B2 891", "Boeing 210 RJ-175",
                LocalTime.of(12,15), Arrays.asList(DayOfWeek.THURSDAY,DayOfWeek.WEDNESDAY)));
        airLines.add(new AirLine("Kiev (ZIA)", "B2 971", "Boeing 737-500",
                LocalTime.of(8,15), Arrays.asList(DayOfWeek.MONDAY,DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,DayOfWeek.THURSDAY,DayOfWeek.FRIDAY,DayOfWeek.SATURDAY,DayOfWeek.SUNDAY)));
        airLines.add(new AirLine("Kiev (ZIA)", "B2 973",
                "Boeing 737-300", LocalTime.of(18,05), everyDay));
        airLines.add(new AirLine("Kiev (SVO)", "SU 1833", "Sukhoi Superjet 100-95",
                LocalTime.of(20,30),Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY)));
        airLines.add(new AirLine("Riga (CRL)", "B2 817", "Boeing 210 175",
                LocalTime.of(8,40), Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.SATURDAY)));
        airLines.add(new AirLine("Riga (CRL)", "B2 817", "Boeing 210 175",
                LocalTime.of(13,00), Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY,
                DayOfWeek.FRIDAY)));
    }

    public List<AirLine> getAirLinesByDestination(String destination) {
        List<AirLine> result = new ArrayList<>();
        for(AirLine airLine:airLines) {
            if (airLine.getDestination().equalsIgnoreCase(destination)) {
                result.add(airLine);
            }
        }
        return result;
    }

    public List<AirLine> getAirLinesByDestinationV8(String destination) {
        return airLines.stream()
                .filter(Objects::nonNull)
                .filter(airLine -> airLine.getDestination()!=null && airLine.getDestination().equalsIgnoreCase(destination))
                .collect(Collectors.toList());
    }

    public List<AirLine> getAirLinesByDayOfWeek(DayOfWeek dayOfWeek) {
        List<AirLine> result = new ArrayList<>();
        for(AirLine airLine:airLines) {
            if(airLine.getDayOfWeeks().contains(dayOfWeek)) {
                result.add(airLine);
            }
        }
        return result;
    }

    public List<AirLine> getAirLinesByDayOfWeekV8(DayOfWeek dayOfWeek) {
        return airLines.stream()
                .filter(Objects::nonNull)
                .filter(airLine -> airLine.getDayOfWeeks()!=null&&airLine.getDayOfWeeks().contains(dayOfWeek))
                .collect(Collectors.toList());
    }

    public List<AirLine> getAirLinesByDayOfWeekAfterSetTimeV8(DayOfWeek dayOfWeek, LocalTime setTime) {
        return airLines.stream()
                .filter(Objects::nonNull)
                .filter(airLine -> airLine.getDayOfWeeks()!=null&&airLine.getDayOfWeeks().contains(dayOfWeek)
                &&airLine.getDepartureTime().isAfter(setTime))
                .collect(Collectors.toList());
    }
}
