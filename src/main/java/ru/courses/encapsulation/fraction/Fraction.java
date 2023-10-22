package ru.courses.encapsulation.fraction;

public class Fraction {
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

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int numeratorResult = (this.numerator * other.denominator) + (this.denominator * other.numerator);
        int denominatorResult = this.denominator * other.denominator;

        return new Fraction(numeratorResult, denominatorResult);
    }

    public Fraction sum(int number) {
        Fraction other = new Fraction(number, 1);
        return this.sum(other);
    }

    public Fraction minus(Fraction other) {
        int numeratorResult = (this.numerator * other.denominator) - (this.denominator * other.numerator);
        int denominatorResult = this.denominator * other.denominator;

        return new Fraction(numeratorResult, denominatorResult);
    }

    public Fraction minus(int number) {
        Fraction other = new Fraction(number, 1);
        return this.minus(other);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        Fraction result = f1.sum(f2).sum(f3).minus(5);
        System.out.println(result);
    }
}
