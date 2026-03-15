package com.bank.util;

import static java.lang.Math.pow;

public class InterestCalculator {

    public static double calcSI(double p, double r, double t) {
        if (p < 0 || r < 0 || t < 0) throw new IllegalArgumentException("Negative values not allowed");
        return (p * r * t) / 100.0;
    }

    public static double calcCI(double p, double r, double t) {
        if (p < 0 || r < 0 || t < 0) throw new IllegalArgumentException("Negative values not allowed");
        double amt = p * pow((1 + r / 100.0), t);
        return amt - p;
    }

    public static double getCIAmt(double p, double r, double t) {
        if (p < 0 || r < 0 || t < 0) throw new IllegalArgumentException("Negative values not allowed");
        return p * pow((1 + r / 100.0), t);
    }

    public static double getSIAmt(double p, double r, double t) {
        return p + calcSI(p, r, t);
    }
}
