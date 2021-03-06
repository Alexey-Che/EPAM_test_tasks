package com.company.doandlearn.testSQL.impl;

import com.company.doandlearn.testSQL.api.FacilityRepository;
import com.company.doandlearn.testSQL.entity.Facility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepositoryImpl implements FacilityRepository {

    private static final String SQL_GET_ALL = "SELECT * FROM facilities"; //TODO remove cd
    private static final String SQL_GET_BY_ID = "SELECT * FROM facilities WHERE facid = ?";
    private static final String SQL_INS_ROW = "INSERT INTO facilities (name, membercost, guestcost, initialoutlay, monthlymaintenance) values (?, ?, ?, ?, ?)";
    private static final String SQL_UPD_ROW = "UPDATE facilities SET name = ?, membercost = ?, guestcost = ?, initialoutlay = ?, monthlymaintenance = ? WHERE facid = ?";
    private static final String SQL_DEL_ROW = "DELETE FROM facilities WHERE facid = ?";

    private final Connection connection;

    public FacilityRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Facility> getAll() throws SQLException {

        Statement st = connection.createStatement() ;

        ResultSet rs = st.executeQuery(SQL_GET_ALL);

        List<Facility> result = new ArrayList<>();

        while (rs.next()) {
            result.add(makeFacility(rs));
        }
        return result;
    }

    public Facility makeFacility(ResultSet resultSet) throws SQLException {
        Facility facility =  new Facility();
        Long id = resultSet.getLong("facid");
        facility.setId(id);
        facility.setName(resultSet.getString("name"));
        facility.setMemberCost(resultSet.getDouble("membercost"));
        facility.setGuestCost(resultSet.getDouble("guestcost"));
        facility.setInitialOutlay(resultSet.getDouble("initialoutlay"));
        facility.setMonthlyMaintenance(resultSet.getDouble("monthlymaintenance"));
        return facility;
    }

    @Override
    public Facility getById(Long id) throws SQLException {
        PreparedStatement st = connection.prepareStatement(SQL_GET_BY_ID);
        st.setInt(1, Math.toIntExact(id));
        ResultSet rs = st.executeQuery();
        Facility facility = new Facility();
        while (rs.next()) {
            facility = makeFacility(rs);
        }
        return facility;
    }

    @Override
    public void create(Facility facility) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_INS_ROW);
            statement.setString(1, facility.getName());
            statement.setDouble(2, facility.getMemberCost());
            statement.setDouble(3, facility.getGuestCost());
            statement.setDouble(4, facility.getInitialOutlay());
            statement.setDouble(5, facility.getMonthlyMaintenance());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Facility facility) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_UPD_ROW);
            statement.setString(1, facility.getName());
            statement.setDouble(2, facility.getMemberCost());
            statement.setDouble(3, facility.getGuestCost());
            statement.setDouble(4, facility.getInitialOutlay());
            statement.setDouble(5, facility.getMonthlyMaintenance());
            statement.setInt(6, Math.toIntExact(facility.getId()));
            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_DEL_ROW);
            statement.setInt(1, Math.toIntExact(id));
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
