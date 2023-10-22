package ru.courses.polymorphism.calculation;

public class Sum {
    public static double sum(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        double a = 2.0;
        double b = 3.0 / 5.0;
        double c = 2.3;
        System.out.println(sum(a, b, c));

        double d = 3.6;
        double e = 49.0 / 12.0;
        double f = 3.0;
        double g = 3.0 / 2.0;
        System.out.println(sum(d, e, f, g));

        double h = 1.0 / 3.0;
        double i = 1.0;
        System.out.println(sum(h,i));
    }
}