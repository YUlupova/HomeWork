package ru.courses.polymorphism.calculation;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(5, 2);

        System.out.println("Дробь: " + fraction.toString());
        System.out.println("Целое значение: " + fraction.intValue());
        System.out.println("Длинное значение: " + fraction.longValue());
        System.out.println("Десятичное значение (float): " + fraction.floatValue());
        System.out.println("Десятичное значение (double): " + fraction.doubleValue());
        System.out.println("Byte: " + fraction.byteValue());
        System.out.println("Short: " + fraction.shortValue());
    }
}
