package com.tw.problem3;

import java.io.IOException;
import java.util.Objects;

public class Quantity <U extends Unit>{
    private final double value;
    private final U unit;
    private final static double minimum = 0;

    private Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public static <U extends Unit> Quantity<U> createQuantity(double value, U volumeUnit) throws IOException {
        if (value < minimum) throw new IOException("Invalid quantity");
        return new Quantity(value, volumeUnit);
    }

    public boolean isEqual(Quantity that) {
        double thisBase = this.baseValue();
        double thatBase = that.baseValue();
        return Double.compare(thisBase, thatBase) == 0;
    }

    private double baseValue() {
        return this.unit.toBaseUnit(this.value);
    }

    public Quantity add(Quantity that) throws IOException {
        double thisBase = this.baseValue();
        double thatBase = that.baseValue();
        Double result = Math.round((thisBase + thatBase) * 100.0) / 100.0;
        return Quantity.createQuantity(result, this.unit.baseUnit());
    }

    public static Quantity add(Quantity quantity1, Quantity quantity2) throws Exception {
        if (quantity1.unit.getClass() != quantity2.unit.getClass())
            throw new Exception("Hello");

        return quantity1.add(quantity2);
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
