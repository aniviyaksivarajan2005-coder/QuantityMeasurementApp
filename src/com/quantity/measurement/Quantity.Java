// UC8: Quantity class NO LONGER handles conversion logic

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

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

    // ✅ Convert using UNIT (delegation)
    public QuantityLength convertTo(LengthUnit targetUnit) {

        double base = unit.convertToBaseUnit(value);   // delegate
        double converted = targetUnit.convertFromBaseUnit(base);

        return new QuantityLength(converted, targetUnit);
    }

    // ✅ Equality using base conversion
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

        double thisBase = this.unit.convertToBaseUnit(this.value);
        double otherBase = other.unit.convertToBaseUnit(other.value);

        return Math.abs(thisBase - otherBase) < 0.0001;
    }

    // ✅ UC7 addition (still works SAME)
    public static QuantityLength add(QuantityLength a, QuantityLength b, LengthUnit targetUnit) {

        if (a == null || b == null || targetUnit == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        double baseSum =
                a.unit.convertToBaseUnit(a.value) +
                        b.unit.convertToBaseUnit(b.value);

        double result = targetUnit.convertFromBaseUnit(baseSum);

        return new QuantityLength(result, targetUnit);
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}