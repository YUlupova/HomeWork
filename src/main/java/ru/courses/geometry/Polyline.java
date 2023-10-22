package ru.courses.geometry;

class Polyline {
    Point[] points;
    public Polyline(Point... points) {
        this.points = points;
    }

    public Polyline() {
        this.points = new Point[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i].getTextRepresentation());
            if (i < points.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public NewLine[] getLine() {
        NewLine[] newNewLines = new NewLine[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            newNewLines[i] = new NewLine(points[i], points[i + 1]);
        }
        return newNewLines;
    }

    // возвращает длину ломаной линии
    public double getLength() {
        double total = 0.0;
        for (int i = 0; i < points.length - 1; i++) {
            total += points[i].distanceTo(points[i + 1]);
        }
        return total;
    }
}