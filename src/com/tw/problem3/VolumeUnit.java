package com.tw.problem3;

public enum VolumeUnit implements Unit {
    LITER(1.0),
    GALLON(3.78);

    final double toLiter;

    VolumeUnit(double toLiter) {
        this.toLiter = toLiter;
    }

    @Override
    public double toBaseUnit(double value) {
        return value * toLiter;
    }
}
