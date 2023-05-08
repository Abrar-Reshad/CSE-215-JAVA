public class Test {
     public static void main(String[] args) {
       
        Fraction p1=new Fraction(2,3);
        Fraction p2=new Fraction(4,5);
        Fraction p3=new Fraction();

        
        p1.setNumerator(2);
        p1.setDenominator(3);
        p2.setNumerator(4);
        p2.setDenominator(5);
        
        System.out.print("Fractions are :"+p1.getNumerator() + "/"+p1.getDenominator());
        System.out.println(" , "+p2.getNumerator() + "/"+p2.getDenominator());
        
        p3.add(p1,p2);
        
        System.out.println("Sum: "+p3.toString());
         
        p3.sub(p1,p2);
       
        System.out.println("Subtraction: "+p3.toString());
         
        p3.mul(p1,p2);
       
        System.out.println("Multipication: "+p3.toString());
         
        p3.div(p1,p2);
       
        System.out.println("Division: "+p3.toString());
      
    }
    
}
