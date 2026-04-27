public class QuantityMeasurementApp {

    public static void main(String[] args) {

        // Equality
        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);

        System.out.println("Equality: " + w1.equals(w2)); // true

        // Conversion
        QuantityWeight converted = w1.convertTo(WeightUnit.GRAM);
        System.out.println("Converted: " + converted);

        // Addition (default unit)
        QuantityWeight sum1 = w1.add(w2);
        System.out.println("Sum (default): " + sum1);

        // Addition (explicit unit)
        QuantityWeight sum2 = w1.add(w2, WeightUnit.POUND);
        System.out.println("Sum (pound): " + sum2);
    }
}