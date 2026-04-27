package com.quantity.measurement;

public class Quantity {

    private double value;
    private LengthUnit unit;

    public Quantity(double value, LengthUnit unit) {

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit (Feet)
    private double toFeet() {
        return unit.toFeet(value);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Quantity)) return false;

        Quantity other = (Quantity) obj;

        return Double.compare(this.toFeet(), other.toFeet()) == 0;
    }
}