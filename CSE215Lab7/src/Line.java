import java.io.*;

public class Line{
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart(){return this.start;}

    public Point getEnd(){return this.end;}

    public void setStart(Point start){this.start = start;}

    public void setEnd(Point end){this.end = end;}

    public double length(){
        return start.distance(this.end);
    }
}