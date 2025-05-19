package com.tw.problem3;

public class Feet {

    private final double feet;

    public Feet(double feet) {
        this.feet = feet;
    }

    public boolean isEqual(Inch inches) {
        return inches.isEqualFeet(this.feet);
    }
}
