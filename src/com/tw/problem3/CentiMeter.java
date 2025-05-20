package com.tw.problem3;

public class CentiMeter {
    private final double value;

    public CentiMeter(double value) {
        this.value = value;
    }

    public boolean isEqualInches(double inches) {
        return this.value/2.5 == inches;
    }

    public boolean isEqual(MilliMeter milliMeter) {
        return milliMeter.isEqualCM(this.value);
    }
}
