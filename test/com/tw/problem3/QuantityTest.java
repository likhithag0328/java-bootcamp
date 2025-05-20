package com.tw.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void testForEqualQuantities() {
        Quantity quantity = new Quantity(1, "gallon");
        assert(quantity.isEqual(new Quantity(3.78, "liter")));
    }

    @Test
    void testForDifferentQuantities() {
        Quantity quantity = new Quantity(1, "gallon");
        assertFalse(quantity.isEqual(new Quantity(3.8, "liter")));
    }
}