package ru.courses.geometry;

class ClosedPolyline extends Polyline {
    public ClosedPolyline(Point... points) {
        super(points);
    }
    @Override
    public double getLength() {
        double totalLength = super.getLength();
        // Проверка на наличие хотя бы двух точек для создания замкнутой линии
        if (super.points.length >= 2) {
            Point first = super.points[0];
            Point last = super.points[super.points.length - 1];
            NewLine closingNewNewLineSegment = new NewLine(first, last);
            totalLength += closingNewNewLineSegment.getLength();
        }
        return totalLength;
    }
}