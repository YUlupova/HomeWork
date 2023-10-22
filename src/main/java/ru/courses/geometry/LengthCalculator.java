package ru.courses.geometry;

public interface LengthCalculator{
    double getLength();
}

class StringLengthCalculator implements LengthCalculator{
    private String str;

    StringLengthCalculator(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}
/*public interface LengthCalculator{

    double getLength();
}

class Line implements LengthCalculator{
    private Point start;
    private Point end;

    Line(Point start, Point end){
        this.start=start;
        this.end=end;
    }

    @Override
    public double getLength(){
        double length=Math.sqrt(Math.pow((end.getX()-start.getX()),2)+Math.pow((end.getY()-start.getY()),2));
        return length;
    }
    public void main(String[] args){

        Point point1=new Point(1,2);
        Point point2=new Point(4,5);

        LengthCalculator line1= (LengthCalculator) new NewLine(point1,point2);
        LengthCalculator[] objects=new LengthCalculator[]{line1};
        printLengths(objects);
    }

    void printLengths(LengthCalculator[]objects){
        for(LengthCalculator object:objects) {
            System.out.print(object.getClass().getSimpleName() + ": ");
        }
    }
}*/