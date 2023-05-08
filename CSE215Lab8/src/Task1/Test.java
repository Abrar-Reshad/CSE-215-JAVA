
package Task1;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a,b,c;
        int d,e,f;
        double g;
        String h;
        System.out.println("Enter ISBN: ");
        d=s.nextInt();
        s.nextLine();
        System.out.println("Enter Title: ");
        a=s.nextLine();
        System.out.println("Enter Author: ");
        b=s.nextLine();
        System.out.println("Enter Price: ");
        e=s.nextInt();
        s.nextLine();
        System.out.println("Ente URL: ");
        c=s.nextLine();
        System.out.println("Enter Size MB: ");
        f=s.nextInt();
        System.out.println("Enter Shopping Weight: ");
        g=s.nextDouble();
        s.nextLine();
        System.out.println("In Stock Status: ");
        h=s.nextLine();
        
                
        Ebook i=new Ebook(d,a,b,e,c,f);
        PaperBook p=new PaperBook(d,a,b,e,c,f,g,h);
        
        
        System.out.println(i);
        System.out.println("");
        System.out.println(p);
    }
}
