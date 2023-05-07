import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,i,j;
        
        System.out.print("Enter a number:");
        a=input.nextInt();
        
        
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.printf("%d,",i);
            }
        }
        
    }
    
}
