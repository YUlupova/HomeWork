package ru.courses.geometry;

class NewLine {
    private Point start;
    private Point finish;
    public NewLine(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }
    public NewLine(double startX, double startY, double finishX, double finishY) {
        this.start = new Point(startX, startY);
        this.finish = new Point(finishX, finishY);
    }
    public String getTextRepresentation() {
        return "Линия от " + start.getTextRepresentation() + " до " + finish.getTextRepresentation();
    }
    public double getLength() {
        double differenceByX = finish.getX() - start.getX();
        double differenceByY = finish.getY() - start.getY();
        return Math.sqrt(differenceByX * differenceByX + differenceByY * differenceByY);
    }
    public Point getstart() {
        return start;
    }
    public Point getFinish() {
        return finish;
    }
    public void setstart(Point newstart) {
        start = newstart;
    }
    public void setFinish(Point newFinish) {
        finish = newFinish;
    }
    public String toString() {
        return "[" + start + " - " + finish + "]";
    }
}