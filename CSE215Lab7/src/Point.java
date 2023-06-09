import java.io.*;
import java.lang.Math;

public class Point{
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){return this.x;}

    public int getY(){return this.y;}

    public void setX(int x){this.x = x;}

    public void setY(int y){this.y = y;}

    public String toString(){
        return "X: "+x + " Y:"+y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow((x - p.getX()), 2) + Math.pow((y - p.getY()), 2));
    }
}