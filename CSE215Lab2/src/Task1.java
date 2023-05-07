import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("Enter a number:");
        a=input.nextInt();
        
        switch(a%2){
            case 0:System.out.println("Even");
                   break;
            case 1:System.out.println("Odd");
                   break;
        }
        
    }
    
    
}
