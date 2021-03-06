package com.company.doandlearn.classes.classandobject.task3;

import java.util.Arrays;

public class Student {
    private String name;
    private String group;
    private int[] performance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", performance=" + Arrays.toString(performance) +
                '}';
    }
}
