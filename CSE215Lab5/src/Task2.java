import java.util.Scanner;
public class Task2 {
    
    public static String isPalindrome(String args)
    {
        String b="";
        int a=args.length();
        for (int i = a-1; i >= 0 ; i--) {//abrar
           
            b=b+args.charAt(i);
        }
        boolean p=false;
        if (args.equals(b))
            return "Palindrome";
        else 
            return "Not palindrome";       
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a word:");
        String g;
        g=s.nextLine();
        System.out.println(" "+isPalindrome(g));
        
    }
    
}
