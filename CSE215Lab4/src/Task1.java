import java.util.Scanner;
public class Task1 {
    
    public static void main(String[] args) {
        int []array=new int[6];
        
        Scanner input=new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            System.out.printf("Enter elment[%d]:",i);
            array[i]=input.nextInt();
            
        }
        double sum=0;
        
        for (int i = 0; i < 6; i++) {               
   
             sum=sum+array[i];
                 
        }
        System.out.println("Sum:"+sum);
        
        double avg,per,o=0;
        avg=sum/6;
        System.out.println("Average:"+avg);
        
        for (int i = 0; i < 6; i++) {
            if(array[i]>avg)
            {
                o++;
            }
            
        }
       
        per=(o/6)*100;
        
        System.out.print("Percentage:"+per);
        System.out.println("%");
        
        
    }
    
    
}
