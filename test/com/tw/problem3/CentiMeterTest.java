package com.tw.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;

class CentiMeterTest {
    @Test
    void testForEqualLengths() {
        CentiMeter centiMeter = new CentiMeter(1);
        assert(centiMeter.isEqual(new MilliMeter(10)));
    }

    @Test
    void testForDifferentLengths() {
        CentiMeter centiMeter = new CentiMeter(1);
        assertFalse(centiMeter.isEqual(new MilliMeter(100)));
    }
}