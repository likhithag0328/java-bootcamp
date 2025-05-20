package com.tw.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void testForEqualLength() {
        Inch inch = new Inch(2);
        assert(inch.isEqual(new CentiMeter(5)));
    }

    @Test
    void testForDifferentLength() {
        Inch inch = new Inch(2);
        assertFalse(inch.isEqual(new CentiMeter(50)));
    }
}