// Enum for Weight Units (Base Unit = KILOGRAM)
public enum WeightUnit {

    KILOGRAM(1.0),        // Base unit
    GRAM(0.001),          // 1 g = 0.001 kg
    POUND(0.453592);      // 1 lb ≈ 0.453592 kg

    private final double conversionFactor;

    // Constructor
    WeightUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    // Getter for conversion factor
    public double getConversionFactor() {
        return conversionFactor;
    }

    // Convert to base unit (Kilogram)
    public double convertToBaseUnit(double value) {
        return value * conversionFactor;
    }

    // Convert from base unit (Kilogram)
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / conversionFactor;
    }
}