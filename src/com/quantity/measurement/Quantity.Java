package com.quantity.measurement;

public class QuantityMeasurementApp {

    // 🔥 Method Overloading (UC5 concept)

    // Method 1: raw values
    public static void demonstrateLengthConversion(double value,
                                                   LengthUnit from,
                                                   LengthUnit to) {

        double result = Quantity.convert(value, from, to);

        System.out.println("Converted: " + value + " " + from +
                " → " + result + " " + to);
    }

    // Method 2: Quantity object
    public static void demonstrateLengthConversion(Quantity q,
                                                   LengthUnit to) {

        Quantity result = q.convertTo(to);

        System.out.println("Converted: " + q + " → " + result);
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        demonstrateLengthConversion(3.0, LengthUnit.YARDS, LengthUnit.FEET);
        demonstrateLengthConversion(36.0, LengthUnit.INCHES, LengthUnit.YARDS);

        Quantity q = new Quantity(1.0, LengthUnit.CENTIMETERS);
        demonstrateLengthConversion(q, LengthUnit.INCHES);
    }
}