import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,isprime=1,i;
        System.out.print("Enter a number:");
        a=input.nextInt();
        
        
           for(i=2;i<a;i++)
            {
                if(a%i==0)
                 {
                     isprime=0;
                     break;
                 }
             }
           
           if (a==1||a==0)
           {
               isprime=0;
                      
           }
        
        
        
        if(isprime==1)
        {
            System.out.printf("%d is prime\n",a);
        }
        else
        {
            System.out.printf("%d is not prime\n",a);
        }
        
        
    }
    
}
