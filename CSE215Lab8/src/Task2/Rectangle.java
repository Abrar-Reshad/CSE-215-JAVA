
package Task2;


public class Rectangle extends Shape {
    double side1;
    double side2;
    
    Rectangle(double side1,double side2,String name)
    {
        super(name);
        this.side1=side1;
        this.side2=side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    public double area()
    {
        return side1*side2;
    }
    public double perimeter()
    {
        return 2*(side1+side2);
    }
    
    
}
