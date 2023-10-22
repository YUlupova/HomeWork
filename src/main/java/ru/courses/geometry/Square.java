package ru.courses.geometry;

public class Square {
    private int x; // Координата левого верхнего угла по X
    private int y; // Координата левого верхнего угла по Y
    private int sideLength; // Длина стороны

    public Square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        setSideLength(sideLength);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException("Длина стороны должна быть положительным числом.");
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке (" + x + ", " + y + ") со стороной " + sideLength;
    }
}