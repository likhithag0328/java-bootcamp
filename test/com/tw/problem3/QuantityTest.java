package com.tw.problem3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void testForEqualVolumes() throws IOException {
        Quantity quantity = Quantity.createQuantity(1, VolumeUnit.GALLON);
        assert(quantity.isEqual(Quantity.createQuantity(3.78, VolumeUnit.LITER)));
    }

    @Test
    void testForDifferentVolumes() throws IOException {
        Quantity quantity = Quantity.createQuantity(1, VolumeUnit.GALLON);
        assertFalse(quantity.isEqual(Quantity.createQuantity(3.8, VolumeUnit.LITER)));
    }

    @Test
    void testForInchToCm() throws IOException {
        Quantity quantity = Quantity.createQuantity(2, LengthUnit.INCH);
        assert(quantity.isEqual(Quantity.createQuantity(5, LengthUnit.CENTIMETER)));
    }

    @Test
    void testForCmToMm() throws IOException {
        Quantity quantity = Quantity.createQuantity(2, LengthUnit.CENTIMETER);
        assert(quantity.isEqual(Quantity.createQuantity(20, LengthUnit.MILLIMETER)));
    }

    @Test
    void testForAddingTwoInches() throws IOException {
        Quantity quantity1 = Quantity.createQuantity(2, LengthUnit.INCH);
        Quantity quantity2 = Quantity.createQuantity(5, LengthUnit.INCH);
        assertEquals(Quantity.createQuantity(7, LengthUnit.INCH), quantity1.add(quantity2));
    }

    @Test
    void testForFailingAddingTwoInches() throws IOException {
        Quantity quantity1 = Quantity.createQuantity(2, LengthUnit.INCH);
        Quantity quantity2 = Quantity.createQuantity(5, LengthUnit.INCH);
        assertNotEquals(Quantity.createQuantity(8, LengthUnit.INCH), quantity1.add(quantity2));
    }
}