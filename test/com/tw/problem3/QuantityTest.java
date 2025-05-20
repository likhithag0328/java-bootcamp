package com.tw.problem3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void testForEqualQuantities() throws IOException {
        Quantity quantity = Quantity.createQuantity(1, VolumeUnit.GALLON);
        assert(quantity.isEqual(Quantity.createQuantity(3.78, VolumeUnit.LITER)));
    }

    @Test
    void testForDifferentQuantities() throws IOException {
        Quantity quantity = Quantity.createQuantity(1, VolumeUnit.GALLON);
        assertFalse(quantity.isEqual(Quantity.createQuantity(3.8, VolumeUnit.LITER)));
    }
}