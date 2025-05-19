package com.tw.problem2;

public class Flip {
    public static double tailsProbability() {
        return 0.5;
    }

    public static double nonTailsProbability() {
        return 1 - tailsProbability();
    }

    public enum CoinOutcomes {
    }
}
