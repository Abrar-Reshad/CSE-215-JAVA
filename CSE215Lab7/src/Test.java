/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abrar
 */
public class Test {
    public static void main(String[] args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3, 4);
        Line line = new Line(p1, p2);
        System.out.println("The length of the line is: "+line.length());
    }
}  

