import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,i,j,b;
        char t;
        System.out.print("Enter pattern line:");
        a=input.nextInt();
        b=1;
        
        
        for(i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                for(j=1;j<=b;j++)
                {
                    System.out.print("+");
                }
            }
            else
            {
               for(j=1;j<=b;j++)
                  {
                    System.out.print("*");
                  } 
            }
             b=b+2;  
             System.out.println("");
            
        }
        
        
        
        
    }
    
    
}
