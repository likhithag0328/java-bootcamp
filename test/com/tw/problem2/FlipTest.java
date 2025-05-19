package com.tw.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipTest {
    @Test
    void tailsProbabilityTest() {
        assertEquals(0.5, Flip.tailsProbability());
    }

    @Test
    void nonTailsProbabilityTest() {
        assertEquals(0.5, Flip.nonTailsProbability());
    }
}