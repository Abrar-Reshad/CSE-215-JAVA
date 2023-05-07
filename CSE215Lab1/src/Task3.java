import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=input.nextInt();
        
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
