package com.quantity.measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    void testFeetEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.compareFeet(1.0, 1.0));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.compareFeet(1.0, 2.0));
    }

    @Test
    void testInchEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.compareInch(1.0, 1.0));
    }

    @Test
    void testInchEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.compareInch(1.0, 2.0));
    }

    @Test
    void testNullComparison() {
        Feet f = new Feet(1.0);
        assertFalse(f.equals(null));
    }

    @Test
    void testSameReference() {
        Feet f = new Feet(1.0);
        assertTrue(f.equals(f));
    }
}