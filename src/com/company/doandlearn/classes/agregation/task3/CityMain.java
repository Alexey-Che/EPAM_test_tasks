package com.company.doandlearn.classes.agregation.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityMain {

    public static void main(String[] args) {
        City city1 = new City("c1__D1__R1", 15);
        City city2 = new City("c2__D1__R1", 123);
        City city3 = new City("c3__D2__R1", 123);
        City city4 = new City("c4__D2__R1", 1234);
        City city5 = new City("c5__D3__R2", 1534);
        City city6 = new City("c6__D3__R2", 1345);
        City city7 = new City("c7__D4__R2", 1231);
        City city8 = new City("c8__D4__R2", 1534);
        City city9 = new City("c9__D5__R3", 5867);
        City city10 = new City("c10__D5__R3", 1867);
        City city11 = new City("c11__D6__R3", 1867);
        City city12 = new City("c12__D6__R3", 1687);
        City city13 = new City("c13__D7__R4", 1867);
        City city14 = new City("c14__D7__R4", 1987);
        City city15 = new City("c15__D8__R4", 21);
        City city16 = new City("c16__D8__R4", 1123);

        List<City> citiesForD1 = new ArrayList<>();
        citiesForD1.add(city1);
        citiesForD1.add(city2);

        District district1 = new District("D1_R1", citiesForD1);
        District district2 = new District("D2_R1", Arrays.asList(city3, city4));
        District district3 = new District("D3_R2", Arrays.asList(city5, city6));
        District district4 = new District("D4_R2", Arrays.asList(city7, city8));
        District district5 = new District("D5_R3", Arrays.asList(city9, city10));
        District district6 = new District("D6_R3", Arrays.asList(city11, city12));
        District district7 = new District("D7_R4", Arrays.asList(city13, city14));
        District district8 = new District("D8_R4", Arrays.asList(city15, city16));

        Region region1 = new Region("Брестская", new City("Брест", 1234),
                Arrays.asList(district1, district2));
        Region region2 = new Region("Гродненская", new City("Гродно", 3453),
                Arrays.asList(district3, district4));
        Region region3 = new Region("Витебская", new City("Витебск", 986),
                Arrays.asList(district5, district6));
        Region region4 = new Region("Минская", new City("Жодино", 5678),
                Arrays.asList(district7, district8));

        City capital = new City("Минск", 3487);

        Country belarus = new Country(capital, "Belarus", Arrays.asList(region1,
                region2, region3, region4));

        System.out.println(belarus.getCapital().getName()+ " столица\n");
        System.out.println(belarus.getRegions().size() + " количество областей\n");
        System.out.println(belarus.getAreaOfCountry() + " площадь страны");
        /*System.out.println("Региональные центры : ");
        belarus.printregionsCenter();*/
    }
}
