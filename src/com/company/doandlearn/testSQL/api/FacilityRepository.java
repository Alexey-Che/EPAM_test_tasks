package com.company.doandlearn.testSQL.api;

import com.company.doandlearn.testSQL.entity.Facility;

import java.sql.SQLException;
import java.util.List;

public interface FacilityRepository {

    List<Facility> getAll() throws SQLException;
    Facility getById(Long id) throws SQLException;
    void create(Facility facility);
    void update(Facility facility);
    void delete(Long id);
}
