import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Enter a year:");
        a=input.nextInt();
        
        if(a%4==0 && a%100!=0 || a%400==0)
        {
            System.out.printf("%d=Leapyear\n",a);
        }
        else
        {
            System.out.printf("%d=Not Leapyear\n",a);
        }
    }
    
}
