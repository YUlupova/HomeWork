package ru.courses.geometry;

    class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        // возвращает расстояние до другой точки
        public double distanceTo(Point other) {
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        public String getTextRepresentation() {
            return "{" + x + ";" + y + "}";
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public void setStart(Point start) {
            this.x = start.getX();
            this.y = start.getY();
        }
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
