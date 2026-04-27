package com.quantity.measurement;

public enum LengthUnit {

    FEET(1.0),
    INCHES(1.0 / 12),
    YARDS(3.0),
    CENTIMETERS(1.0 / 30.48);

    private final double toFeetFactor;

    LengthUnit(double factor) {
        this.toFeetFactor = factor;
    }

    public double toFeet(double value) {
        return value * toFeetFactor;
    }

    public double fromFeet(double feetValue) {
        return feetValue / toFeetFactor;
    }
}