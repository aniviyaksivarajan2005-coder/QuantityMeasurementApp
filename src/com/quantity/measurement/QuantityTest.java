package com.quantity.measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    private static final double EPS = 1e-6;

    @Test
    void testFeetToInches() {
        assertEquals(12.0,
                Quantity.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES),
                EPS);
    }

    @Test
    void testInchesToFeet() {
        assertEquals(2.0,
                Quantity.convert(24.0, LengthUnit.INCHES, LengthUnit.FEET),
                EPS);
    }

    @Test
    void testYardsToInches() {
        assertEquals(36.0,
                Quantity.convert(1.0, LengthUnit.YARDS, LengthUnit.INCHES),
                EPS);
    }

    @Test
    void testCmToInches() {
        assertEquals(1.0,
                Quantity.convert(2.54, LengthUnit.CENTIMETERS, LengthUnit.INCHES),
                EPS);
    }

    @Test
    void testZero() {
        assertEquals(0.0,
                Quantity.convert(0.0, LengthUnit.FEET, LengthUnit.INCHES),
                EPS);
    }

    @Test
    void testNegative() {
        assertEquals(-12.0,
                Quantity.convert(-1.0, LengthUnit.FEET, LengthUnit.INCHES),
                EPS);
    }

    @Test
    void testSameUnit() {
        assertEquals(5.0,
                Quantity.convert(5.0, LengthUnit.FEET, LengthUnit.FEET),
                EPS);
    }

    @Test
    void testInvalidUnit() {
        assertThrows(IllegalArgumentException.class, () ->
                Quantity.convert(1.0, null, LengthUnit.FEET));
    }

    @Test
    void testInvalidValue() {
        assertThrows(IllegalArgumentException.class, () ->
                Quantity.convert(Double.NaN, LengthUnit.FEET, LengthUnit.INCHES));
    }
}