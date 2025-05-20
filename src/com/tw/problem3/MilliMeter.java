package com.tw.problem3;

public class MilliMeter {
    private final double value;

    public MilliMeter(double value) {
        this.value = value;
    }

    public boolean isEqualCM(double cm) {
        return this.value/10 == cm;
    }
}
