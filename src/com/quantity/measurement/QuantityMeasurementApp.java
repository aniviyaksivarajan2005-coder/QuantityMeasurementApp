package com.quantity.measurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);

        // Convert 1 foot → inches
        Quantity result = q1.convertTo(LengthUnit.INCH);

        System.out.println("Converted: " + result);

        // Cross-check equality
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        System.out.println("Are equal? " + result.equals(q2));
    }
}