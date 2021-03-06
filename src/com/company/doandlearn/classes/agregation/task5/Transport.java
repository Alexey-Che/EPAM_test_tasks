package com.company.doandlearn.classes.agregation.task5;

public enum Transport {
    PLANE,
    BUS,
    TRAIN,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
