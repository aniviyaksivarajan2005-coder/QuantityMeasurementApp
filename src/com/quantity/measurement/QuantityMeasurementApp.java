public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("=== UC8 Refactored Design ===");

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);

        // Conversion
        System.out.println(q1.convertTo(LengthUnit.INCHES));

        // Equality
        System.out.println("Equal: " + q1.equals(q2));

        // Addition
        QuantityLength result =
                QuantityLength.add(q1, q2, LengthUnit.FEET);

        System.out.println("Addition: " + result);
    }
}