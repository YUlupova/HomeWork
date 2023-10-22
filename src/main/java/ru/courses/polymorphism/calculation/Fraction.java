package ru.courses.polymorphism.calculation;

public class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }

        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public byte byteValue() {
        return (byte) (numerator / denominator);
    }

    @Override
    public short shortValue() {
        return (short) (numerator / denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}