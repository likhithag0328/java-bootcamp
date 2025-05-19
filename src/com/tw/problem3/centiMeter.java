package com.tw.problem3;

public class centiMeter {
    private final double value;

    public centiMeter(double value) {
        this.value = value;
    }

    public boolean isEqualInches(double inches) {
        return this.value/2.5 == inches;
    }
}
