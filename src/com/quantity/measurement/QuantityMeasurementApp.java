package com.quantity.measurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCHES);

        Quantity result1 = q1.add(q2);
        System.out.println("1 FEET + 12 INCHES = " + result1);

        Quantity q3 = new Quantity(12.0, LengthUnit.INCHES);
        Quantity q4 = new Quantity(1.0, LengthUnit.FEET);

        Quantity result2 = q3.add(q4);
        System.out.println("12 INCHES + 1 FEET = " + result2);

        Quantity q5 = new Quantity(1.0, LengthUnit.YARDS);
        Quantity q6 = new Quantity(3.0, LengthUnit.FEET);

        System.out.println("1 YARD + 3 FEET = " + q5.add(q6));
    }
}