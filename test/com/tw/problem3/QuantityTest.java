package com.tw.problem3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void testForEqualQuantities() throws IOException {
        Quantity quantity = Quantity.createQuantity(1, "gallon");
        assert(quantity.isEqual(Quantity.createQuantity(3.78, "liter")));
    }

    @Test
    void testForDifferentQuantities() throws IOException {
        Quantity quantity = Quantity.createQuantity(1, "gallon");
        assertFalse(quantity.isEqual(Quantity.createQuantity(3.8, "liter")));
    }
}