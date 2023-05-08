
package Task1;


public class PaperBook extends Book {
    double shoppingweight;
    String instock;
    
    PaperBook(int i,String t,String a,int p,String d,int s, double sp,String in)
    {
        super(i,t,a,p);
        shoppingweight=sp;
        instock=in;
        
    }
    
    public String toString()
    {
        return super.toString() + "\nShopping Weight: "+shoppingweight + "\nIn stock: "+instock;
    }
}
