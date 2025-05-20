package com.tw.problem3;

import java.io.IOException;
import java.util.Objects;

public class Quantity {
    private final double value;
    private final UnitCategory unit;
    private final static double minimum = 0;

    private Quantity(double value, UnitCategory unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Quantity createQuantity(double value, UnitCategory volumeUnit) throws IOException {
        if (value < minimum) throw new IOException("Invalid quantity");
        return new Quantity(value, volumeUnit);
    }

    public boolean isEqual(Quantity that) {
        double thisBase = this.unit.toBaseUnit(this.value);
        double thatBase = that.unit.toBaseUnit(that.value);
        return Double.compare(thisBase, thatBase) == 0;
    }

    public Quantity add(Quantity that) throws IOException {
        return Quantity.createQuantity(this.value + that.value, this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Quantity)) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(value, quantity.value) == 0 && Objects.equals(unit, quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
