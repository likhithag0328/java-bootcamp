package com.tw.problem3;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }


    public boolean isEqualFeet(double feet) {
        return this.value/12 == feet;
    }

    public boolean isEqual(CentiMeter cm) {
        return cm.isEqualInches(this.value);
    }
}
