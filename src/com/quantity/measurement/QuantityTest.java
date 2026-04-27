package com.quantity.measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    private static final double EPS = 1e-6;

    @Test
    void testSameUnitAddition() {
        Quantity result = new Quantity(1.0, LengthUnit.FEET)
                .add(new Quantity(2.0, LengthUnit.FEET));

        assertEquals(3.0, result.convertTo(LengthUnit.FEET).convertTo(LengthUnit.FEET).value, EPS);
    }

    @Test
    void testFeetPlusInches() {
        Quantity result = new Quantity(1.0, LengthUnit.FEET)
                .add(new Quantity(12.0, LengthUnit.INCHES));

        assertTrue(result.equals(new Quantity(2.0, LengthUnit.FEET)));
    }

    @Test
    void testInchesPlusFeet() {
        Quantity result = new Quantity(12.0, LengthUnit.INCHES)
                .add(new Quantity(1.0, LengthUnit.FEET));

        assertTrue(result.equals(new Quantity(24.0, LengthUnit.INCHES)));
    }

    @Test
    void testYardPlusFeet() {
        Quantity result = new Quantity(1.0, LengthUnit.YARDS)
                .add(new Quantity(3.0, LengthUnit.FEET));

        assertTrue(result.equals(new Quantity(2.0, LengthUnit.YARDS)));
    }

    @Test
    void testZeroAddition() {
        Quantity result = new Quantity(5.0, LengthUnit.FEET)
                .add(new Quantity(0.0, LengthUnit.INCHES));

        assertTrue(result.equals(new Quantity(5.0, LengthUnit.FEET)));
    }

    @Test
    void testNegativeValues() {
        Quantity result = new Quantity(5.0, LengthUnit.FEET)
                .add(new Quantity(-2.0, LengthUnit.FEET));

        assertTrue(result.equals(new Quantity(3.0, LengthUnit.FEET)));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Quantity(1.0, LengthUnit.FEET).add(null);
        });
    }
}