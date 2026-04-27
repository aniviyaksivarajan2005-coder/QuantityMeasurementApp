package com.quantity.measurement;

public class Feet {

    private double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true; // same reference
        if (obj == null) return false; // null check
        if (getClass() != obj.getClass()) return false; // type check

        Feet other = (Feet) obj;

        return Double.compare(this.value, other.value) == 0;
    }
}
