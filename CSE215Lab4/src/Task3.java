import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("3x3 Matrix");
        int [][]a=new int[3][3];
        
        a[0][0]=3;
        a[0][1]=4;
        a[0][2]=9;
        a[1][0]=2;
        a[1][1]=9;     
        a[1][2]=11;      
        a[2][0]=4;       
        a[2][1]=6;
        a[2][2]=0;  
        
        int sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8;
        
        sum1=a[0][0]+a[0][1]+a[0][2];
        sum2=a[1][0]+a[1][1]+a[1][2];
        sum3=a[2][0]+a[2][1]+a[2][2];
        sum4=a[0][0]+a[1][0]+a[2][0];       
        sum5=a[0][1]+a[1][1]+a[2][1];
        sum6=a[0][2]+a[1][2]+a[2][2];
        sum7=a[0][0]+a[1][1]+a[2][2];
        sum8=a[0][2]+a[1][1]+a[2][0];       
        
        System.out.println("Row 1 sum:"+sum1);
        System.out.println("Row 2 sum:"+sum2);
        System.out.println("Row 3 sum:"+sum3);
        System.out.println("Coloum 1 sum:"+sum4);
        System.out.println("Coloum 2 sum:"+sum5);
        System.out.println("Coloum 3 sum:"+sum6);
        System.out.println("Diagnal 1:"+sum7);
        System.out.println("Diagnal 2:"+sum8);
               
                
    }
    
}
