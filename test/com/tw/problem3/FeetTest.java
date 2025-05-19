package com.tw.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void testForEqualLength() {
        Feet feet = new Feet(2);
        assert(feet.isEqual(new Inch(24)));
    }

    @Test
    void testForDifferentLength() {
        Feet feet = new Feet(5);
        assertFalse(feet.isEqual(new Inch(24)));
    }

    @Test
    void testForFloatingPointFeet() {
        Feet feet = new Feet(2.5);
        assert(feet.isEqual(new Inch(30)));
    }
}