package com.tw.problem3;

public enum LengthUnit implements UnitCategory {
    METER(1.0),
    CENTIMETER(0.01),
    MILLIMETER(0.001),
    INCH(0.025),
    FOOT(0.3);

    final double toMeter;

    LengthUnit(double toMeter) {
        this.toMeter = toMeter;
    }

    public double toBaseUnit(double value) {
        return value * toMeter;
    }
}
