
public class Fraction {
     private int numerator;
     private int denominator;
     
    Fraction(int numerator,int denominator)
    {
     this.numerator=numerator;
     this.denominator=denominator;
    }
    
    Fraction()
    {
    }
    
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public String toString()
    {
        return ""+numerator +"/"+ denominator;
    }
    
    public void add(Fraction p1,Fraction p2)
    {
        int num1=p1.numerator;
        int num2=p1.denominator;
        int num3=p2.numerator;
        int num4=p2.denominator;
        
        numerator=(num1*num4)+(num3*num2);
        denominator=(num2*num4);    
    }
    
    public void sub(Fraction p1,Fraction p2)
    {
        int num1=p1.numerator;
        int num2=p1.denominator;
        int num3=p2.numerator;
        int num4=p2.denominator;
        
        numerator=(num1*num4)-(num3*num2);
        denominator=(num2*num4);    
    }
    
    public void mul(Fraction p1,Fraction p2)
    {
        int num1=p1.numerator;
        int num2=p1.denominator;
        int num3=p2.numerator;
        int num4=p2.denominator;
        
        numerator=(num1*num3);
        denominator=(num2*num4);    
    }
    
    public void div(Fraction p1,Fraction p2)
    {
        int num1=p1.numerator;
        int num2=p1.denominator;
        int num3=p2.numerator;
        int num4=p2.denominator;
        
        numerator=(num1*num4);
        denominator=(num2*num3);    
    }
    
   
    
}
