import java.util.Scanner;
public class Task1 {
    
    public static int countVowels(String args)
    {
        int y=0;
       
        for(int i=0 ; i<args.length(); i++)
        {   
            char p=args.charAt(i);
            if (p=='a' || p=='e' || p=='i' || p=='o' || p=='u')
            {
                y++;
                
            }
        }
        System.out.println("");
        return y;
        
    }
    
    public static void main(String[] args) {
        String a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string:");
        a=s.nextLine();
        
        System.out.println("Vowels: "+countVowels(a));
        
    }
}
