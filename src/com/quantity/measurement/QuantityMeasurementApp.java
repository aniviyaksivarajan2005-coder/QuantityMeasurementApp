public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("=== UC7: Addition with Target Unit ===");

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);

        // UC7: Explicit target unit
        QuantityLength result1 = QuantityLength.add(q1, q2, LengthUnit.FEET);
        QuantityLength result2 = QuantityLength.add(q1, q2, LengthUnit.INCHES);
        QuantityLength result3 = QuantityLength.add(q1, q2, LengthUnit.YARDS);

        System.out.println("Result in FEET: " + result1);
        System.out.println("Result in INCHES: " + result2);
        System.out.println("Result in YARDS: " + result3);
    }
}