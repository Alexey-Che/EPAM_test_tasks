package com.company.doandlearn.testSQL;

import com.company.doandlearn.testSQL.api.FacilityRepository;
import com.company.doandlearn.testSQL.entity.Facility;
import com.company.doandlearn.testSQL.impl.FacilityRepositoryImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[]args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/exercises?currentSchema=cd";

        Connection cn = DriverManager.getConnection(url,
                "postgres", "postgres");
        FacilityRepository facilityRepository = new FacilityRepositoryImpl(cn);
        List<Facility> facilities = facilityRepository.getAll();
        facilities.forEach(System.out::println);
        facilityRepository.getAll();
        Facility facility = facilityRepository.getById((long) 4);
        System.out.println(facility);
        facility.setId(null);
        facility.setName("bar");
        facilityRepository.create(facility);
        facilities = facilityRepository.getAll();
        facilities.forEach(System.out::println);
        Facility facility6 = facilityRepository.getById(6L);
        facility6.setName("beer");
        facilityRepository.update(facility6);
        facilityRepository.delete(10L);






    }
}
