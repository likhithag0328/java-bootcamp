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
        try{
            Probability.create(2.5).complement();
        } catch (InvalidProbabilityException e) {
            System.out.println(e);
        }
    }
}