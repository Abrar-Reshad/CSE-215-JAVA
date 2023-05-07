
import java.util.Scanner;


public class Task3 {
    static int balance=0;
    
    
    static void deposit()
    {
        
       
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter amount:");
        a=s.nextInt();
        balance=balance+a;//
        System.out.println("success");
    }
    
    static void balance()
    {
        
        System.out.println("Your balance is: "+balance);
    }
    
    static void withdraw()
    {
        Scanner s=new Scanner(System.in);
        int b;
        System.out.println("Enter Amount to withdraw: ");
        b=s.nextInt();
        if(balance>b)
        balance=balance-b;
        else
            System.out.println("Sorry insufficient balance");
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        while(true)
        {
            System.out.println("1.Deposit");
            System.out.println("2.Balance");
            System.out.println("3.withdraw");
            System.out.println("4.Exit");
            System.out.print("Choose an option:");
            n=s.nextInt();
            
            if(n==1)
                deposit();
            if(n==2)
                balance();
            if(n==3)
                withdraw();
            if(n==4)
                break;
        }
        
        
    }
    
    
    
}
