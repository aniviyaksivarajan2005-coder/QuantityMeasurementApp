package com.quantity.measurement;

public class QuantityMeasurementApp {

    // Method to check equality of two feet values
    public boolean isEqual(double value1, double value2) {
        return value1 == value2;
    }

    public static void main(String[] args) {

        QuantityMeasurementApp app = new QuantityMeasurementApp();

        double feet1 = 5.0;
        double feet2 = 5.0;

        boolean result = app.isEqual(feet1, feet2);

        System.out.println("Are both values equal? " + result);
    }
}