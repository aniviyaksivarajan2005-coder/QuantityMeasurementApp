// UC8: Standalone Enum with FULL responsibility for conversion

public enum LengthUnit {

    FEET(1.0),
    INCHES(1.0 / 12.0),
    YARDS(3.0),
    CENTIMETERS(0.0328084);

    private final double factor; // conversion factor to base (FEET)

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    // ✅ Convert THIS unit → BASE UNIT (FEET)
    public double convertToBaseUnit(double value) {
        return value * factor;
    }

    // ✅ Convert BASE UNIT (FEET) → THIS unit
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / factor;
    }
}