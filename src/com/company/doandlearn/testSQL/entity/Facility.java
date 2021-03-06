package com.company.doandlearn.testSQL.entity;

public class Facility {

    private Long id;
    private String name;
    private double memberCost;
    private double guestCost;
    private double initialOutlay;
    private double monthlyMaintenance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemberCost() {
        return memberCost;
    }

    public void setMemberCost(double memberCost) {
        this.memberCost = memberCost;
    }

    public double getGuestCost() {
        return guestCost;
    }

    public void setGuestCost(double guestCost) {
        this.guestCost = guestCost;
    }

    public double getInitialOutlay() {
        return initialOutlay;
    }

    public void setInitialOutlay(double initialOutlay) {
        this.initialOutlay = initialOutlay;
    }

    public double getMonthlyMaintenance() {
        return monthlyMaintenance;
    }

    public void setMonthlyMaintenance(double monthlyMaintenance) {
        this.monthlyMaintenance = monthlyMaintenance;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memberCost=" + memberCost +
                ", guestCost=" + guestCost +
                ", initialOutlay=" + initialOutlay +
                ", monthlyMaintenance=" + monthlyMaintenance +
                '}';
    }
}
