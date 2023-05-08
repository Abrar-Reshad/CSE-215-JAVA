
package Task1;

public class Ebook extends Book {
    String downloadurl;
    int sizeMB;
    
    Ebook(int i,String t,String a,int p,String d,int s)
    {
        super(i,t,a,p);
        downloadurl=d;
        sizeMB=s;
    }
    
    public String toString()
    {
        return super.toString()+ "\nDownload URL: "+downloadurl +"\nSize MB: "+sizeMB;
    }
}
