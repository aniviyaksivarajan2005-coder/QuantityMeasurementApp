package com.quantity.measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void testFeetToFeet_SameValue() {
        assertTrue(new Quantity(1.0, LengthUnit.FEET)
                .equals(new Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void testInchToInch_SameValue() {
        assertTrue(new Quantity(1.0, LengthUnit.INCH)
                .equals(new Quantity(1.0, LengthUnit.INCH)));
    }

    @Test
    void testFeetToInch_Equivalent() {
        assertTrue(new Quantity(1.0, LengthUnit.FEET)
                .equals(new Quantity(12.0, LengthUnit.INCH)));
    }

    @Test
    void testInchToFeet_Equivalent() {
        assertTrue(new Quantity(12.0, LengthUnit.INCH)
                .equals(new Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void testFeetDifferent() {
        assertFalse(new Quantity(1.0, LengthUnit.FEET)
                .equals(new Quantity(2.0, LengthUnit.FEET)));
    }

    @Test
    void testInchDifferent() {
        assertFalse(new Quantity(1.0, LengthUnit.INCH)
                .equals(new Quantity(2.0, LengthUnit.INCH)));
    }

    @Test
    void testNullComparison() {
        Quantity q = new Quantity(1.0, LengthUnit.FEET);
        assertFalse(q.equals(null));
    }

    @Test
    void testSameReference() {
        Quantity q = new Quantity(1.0, LengthUnit.FEET);
        assertTrue(q.equals(q));
    }

    @Test
    void testInvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Quantity(1.0, null);
        });
    }
}