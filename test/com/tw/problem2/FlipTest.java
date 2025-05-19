package com.tw.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TossTest {
    @Test
    void tailsProbabilityTest() {
        assertEquals(Flip.tailsProbability(),50);
    }
}