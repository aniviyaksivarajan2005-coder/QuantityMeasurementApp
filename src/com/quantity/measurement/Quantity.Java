// 🔥 UC6: ADD METHOD (Instance Method)
public Quantity add(Quantity other) {

    if (other == null)
        throw new IllegalArgumentException("Other quantity cannot be null");

    if (!Double.isFinite(this.value) || !Double.isFinite(other.value))
        throw new IllegalArgumentException("Invalid numeric value");

    // Step 1: Convert both to base (feet)
    double thisInFeet = this.unit.toFeet(this.value);
    double otherInFeet = other.unit.toFeet(other.value);

    // Step 2: Add
    double sumInFeet = thisInFeet + otherInFeet;

    // Step 3: Convert back to unit of first operand
    double resultValue = this.unit.fromFeet(sumInFeet);

    return new Quantity(resultValue, this.unit);
}