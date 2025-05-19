package com.tw.problem2;

import com.tw.InvalidProbabilityException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ProbabilityTest {
    @Test
    void complementTestForValidProbability() throws InvalidProbabilityException {
        Probability chance = Probability.create(0.25).complement();
        assertEquals(Probability.create(0.75),chance);
    }

    @Test
    void complementTestForInvalidProbability() {
        InvalidProbabilityException exception = assertThrows(InvalidProbabilityException.class, ()->Probability.create(2.5));

        assertEquals("Invalid probability", exception.getMessage());
    }

    @Test
    void andTestForValidProbability() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.5);
        Probability combinedProbability = probability.and(Probability.create(0.5));
        assertEquals(Probability.create(0.25),combinedProbability);
    }
}