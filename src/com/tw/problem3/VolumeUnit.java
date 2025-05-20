package com.tw.problem3;

public enum VolumeUnit implements UnitCategory {
    LITER(1.0),
    GALLON(3.78);

    final double toLiter;

    VolumeUnit(double toLiter) {
        this.toLiter = toLiter;
    }

    public double toBaseUnit(double value) {
        return value * toLiter;
    }
}
