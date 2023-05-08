
package Task1;

public class Book {
    int isbn;
    String title;
    String author;
    int price;
    
    Book(int i,String t,String a,int p)
    {
        isbn=i;
        title=t;
        author=a;
        price=p;
    }
            
    public String toString()
    {
        return "ISBN: "+isbn +"\nTitle: "+title + "\nAuthor: "+author + "\nPrice: "+price;
    }
    
            
}
