package com.tw.problem3;

import java.io.IOException;

public class Quantity {
    private final double value;
    private final UnitCategory unit;
    private final static double minimum = 0;

    private Quantity(double value, UnitCategory unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Quantity createQuantity(double value, VolumeUnit volumeUnit) throws IOException {
        if (value < minimum) throw new IOException("Invalid quantity");
        return new Quantity(value, volumeUnit);
    }

    public boolean isEqual(Quantity other) {
        double thisBase = this.unit.toBaseUnit(this.value);
        double otherBase = other.unit.toBaseUnit(other.value);
        return Double.compare(thisBase, otherBase) == 0;
    }
}
