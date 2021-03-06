package com.company.doandlearn.classes.agregation.task5;

public enum Food {
    NOT_INCLUDET ("Not Included"),
    BREAKFAST("Breakfast"),
    ALL_INCLUSIVE("All Inclusive");

    private final String label;

    Food(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
