import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,i,j,b;
        System.out.print("Enter a num for pattern:");
        a=input.nextInt();
        b=a;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=b;j++)
            {
                System.out.printf("%d",j);
            }
            b--;
            System.out.println("");
        }
        
    }
    
}
