package com.tw.problem3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Quantity {
    private final double value;
    private final String unit;

    private static final Map<String, Double> ratioRelativeToLiter;
    static {
        Map<String, Double> temp = new HashMap<>();
        temp.put("liter", 1.0);
        temp.put("gallon", 3.78);
        ratioRelativeToLiter = Collections.unmodifiableMap(temp);
    }

    public Quantity(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean isEqual(Quantity that) {
        return this.toBaseUnit() == that.toBaseUnit();
    }

    private double toBaseUnit() {
        return this.value * ratioRelativeToLiter.get(this.unit);
    }
}
