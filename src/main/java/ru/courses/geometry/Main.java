package ru.courses.geometry;

class Main {
    public static void main(String[] args){
        LengthCalculator stringLength = new StringLengthCalculator("Hello, world!");

        LengthCalculator[] objects = new LengthCalculator[]{stringLength};

        printLengths(objects);
    }

    private static void printLengths(LengthCalculator[] objects){
        for(LengthCalculator object : objects) {
            System.out.println(object.getClass().getSimpleName() + ": " + object.getLength());
        }
    }
}