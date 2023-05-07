import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a,i;
        a=input.nextInt();
        
        for(i=0;i<=a;i++)
        {
            System.out.printf("%d ",i);
        }
        
    }
    
}
