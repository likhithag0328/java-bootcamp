package com.tw.problem2;

import com.tw.InvalidProbabilityException;

import java.util.Objects;

public class Probability {


    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability create(double probability) throws InvalidProbabilityException {
        if (probability < 0 || probability > 1) {
            throw new InvalidProbabilityException("Invalid probability");
        }
        return new Probability(probability);
    }

    public Probability complement() {
        return new Probability(1 - this.probability);
    }

    public Probability and(Probability that) throws InvalidProbabilityException {
        return Probability.create(this.probability * that.probability);
    }

    public Probability or(Probability that) throws InvalidProbabilityException {
        return Probability.create(this.probability + that.probability - this.probability * that.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability)) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }
}
