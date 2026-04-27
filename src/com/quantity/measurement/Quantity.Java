public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    // Constructor
    public QuantityLength(double value, LengthUnit unit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    // Convert to base unit (FEET)
    private double toBase() {
        return value * unit.getFactor();
    }

    // Convert to target unit
    public QuantityLength convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double base = this.toBase();
        double converted = base / targetUnit.getFactor();

        return new QuantityLength(converted, targetUnit);
    }

    // ✅ UC6 METHOD (default target = first operand)
    public static QuantityLength add(QuantityLength a, QuantityLength b) {
        return add(a, b, a.unit);
    }

    // ✅ ✅ UC7 METHOD (explicit target unit)
    public static QuantityLength add(QuantityLength a, QuantityLength b, LengthUnit targetUnit) {

        // Validation
        if (a == null || b == null) {
            throw new IllegalArgumentException("Operands cannot be null");
        }

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        // Convert both to base (feet)
        double baseSum = a.toBase() + b.toBase();

        // Convert to target unit
        double result = baseSum / targetUnit.getFactor();

        return new QuantityLength(result, targetUnit);
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}