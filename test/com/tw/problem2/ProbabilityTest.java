package com.tw.problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ProbabilityTest {
    @Test
    void complementTestForValidProbability() throws InvalidProbabilityException {
        Probability probabilityOfGettingTails = Probability.create(0.25).complement();
        assertEquals(Probability.create(0.75),probabilityOfGettingTails);
    }

    @Test
    void testForInvalidProbability() {
        InvalidProbabilityException exception = assertThrows(InvalidProbabilityException.class, ()->Probability.create(2.5));

        assertEquals("Invalid probability", exception.getMessage());
    }

    @Test
    void andTestForValidProbability() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.5);
        Probability combinedProbability = probability.and(Probability.create(0.5));
        assertEquals(Probability.create(0.25),combinedProbability);
    }

    @Test
    void orTestForValidProbability() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.5);
        Probability combinedProbality = probability.or(Probability.create(0.5));
        assertEquals(Probability.create(0.75),combinedProbality);
    }
}