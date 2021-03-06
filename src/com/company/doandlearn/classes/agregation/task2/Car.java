package com.company.doandlearn.classes.agregation.task2;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Engine engine;
    private List<Wheel> wheels;
    private String mark;
    private boolean fuel;

    public Car(String engineName, List<Wheel> wheels, String mark, boolean fuel) {
        this.engine = new Engine();
        this.engine.setName(engineName);
        this.wheels = wheels;
        this.mark = mark;
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public String getMark() {
        return mark;
    }

    public boolean isFuel() {
        return fuel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setFuel(boolean fuel) {
        this.fuel = fuel;
    }

    public void reFuel() {
        setFuel(true);
        System.out.println("Car is refueled");
    }

    public void changeWheel(List<Wheel> wheels, int wheel) {
        wheels.remove(wheel);
        wheels.add(wheel,new Wheel());
        System.out.println("Заменено колесо номер " + wheel);
    }

    public void go() {
        if (!isFuel()) {
            System.out.println("заправтесь");
        }
        if (getWheels().size() != 4) {
            System.out.println("разберитесь с колесами");
        }
        if (isFuel() && getWheels().size() == 4) {
            System.out.println("поихали");
        }
    }
}
