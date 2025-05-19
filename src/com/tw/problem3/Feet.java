package com.tw.problem3;

public class Feet {

    private final double feet;

    public Feet(double feet) {
        this.feet = feet;
    }

    public boolean isEqual(double inches) {
        return inches/12 == this.feet;
    }
}
