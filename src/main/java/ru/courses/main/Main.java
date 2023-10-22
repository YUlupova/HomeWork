package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {

    public static int power(String x, String y) {
        int num1 = parseInt(x);
        int num2 = parseInt(y);
        return (int) pow(num1, num2);
    }

    public static void main(String[] args) {
        String x = "2";
        String y = "3";
        System.out.println(power(x, y));
    }
}