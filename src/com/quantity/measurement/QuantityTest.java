import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityWeightTest {

    @Test
    void testEquality_KgToGram() {
        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);
        assertTrue(w1.equals(w2));
    }

    @Test
    void testConversion_KgToPound() {
        QuantityWeight w = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight result = w.convertTo(WeightUnit.POUND);
        assertEquals(2.20462, result.convertTo(WeightUnit.POUND).convertTo(WeightUnit.POUND).value, 0.01);
    }

    @Test
    void testAddition_KgPlusGram() {
        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);

        QuantityWeight result = w1.add(w2);
        assertTrue(result.equals(new QuantityWeight(2.0, WeightUnit.KILOGRAM)));
    }

    @Test
    void testAddition_WithTargetUnit() {
        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);

        QuantityWeight result = w1.add(w2, WeightUnit.GRAM);
        assertTrue(result.equals(new QuantityWeight(2000.0, WeightUnit.GRAM)));
    }

    @Test
    void testInvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new QuantityWeight(1.0, null);
        });
    }

    @Test
    void testNullComparison() {
        QuantityWeight w = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        assertFalse(w.equals(null));
    }
}