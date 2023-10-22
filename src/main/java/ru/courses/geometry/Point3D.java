package ru.courses.geometry;

public class Point3D extends Point {
    private double z;
    public Point3D(double x, double y, double z) {
        super(x, y); // вызываем конструктор родительского класса Point
        this.z = z;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    @Override
    public String getTextRepresentation() {
        return "{" + getX() + ";" + getY() + ";" + z + "}";
    }
    public void setStart(Point3D start) {
        super.setStart(start);
        setZ(start.getZ());
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}