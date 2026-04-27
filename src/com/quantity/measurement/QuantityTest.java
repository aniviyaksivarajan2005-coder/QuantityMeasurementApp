package com.quantity.measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void testFeetToInchConversion() {
        Quantity q = new Quantity(1.0, LengthUnit.FEET);
        Quantity result = q.convertTo(LengthUnit.INCH);

        assertTrue(result.equals(new Quantity(12.0, LengthUnit.INCH)));
    }

    @Test
    void testInchToFeetConversion() {
        Quantity q = new Quantity(12.0, LengthUnit.INCH);
        Quantity result = q.convertTo(LengthUnit.FEET);

        assertTrue(result.equals(new Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void testFeetToYardConversion() {
        Quantity q = new Quantity(3.0, LengthUnit.FEET);
        Quantity result = q.convertTo(LengthUnit.YARD);

        assertTrue(result.equals(new Quantity(1.0, LengthUnit.YARD)));
    }

    @Test
    void testFeetToCmConversion() {
        Quantity q = new Quantity(1.0, LengthUnit.FEET);
        Quantity result = q.convertTo(LengthUnit.CM);

        assertTrue(result.equals(new Quantity(30.48, LengthUnit.CM)));
    }
}s