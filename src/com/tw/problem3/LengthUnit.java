package com.tw.problem3;

import sun.security.util.Length;

public enum LengthUnit implements Unit {
    CENTIMETER(0.4),
    MILLIMETER(0.04),
    INCH(1.0),
    FOOT(12);

    final double toInches;

    LengthUnit(double toInches) {
        this.toInches = toInches;
    }

    @Override
    public double toBaseUnit(double value) {
        return value * toInches;
    }

    @Override
    public Unit baseUnit() {
        return LengthUnit.INCH;
    }
}
