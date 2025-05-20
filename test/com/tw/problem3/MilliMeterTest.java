package com.tw.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilliMeterTest {
    @Test
    void testForDifferentLength() {
        MilliMeter milliMeter = new MilliMeter(100);
        assertFalse(milliMeter.isEqualCM(2));
    }

    @Test
    void testForEqualLength() {
        MilliMeter milliMeter = new MilliMeter(100);
        assertFalse(milliMeter.isEqualCM(10));
    }
}