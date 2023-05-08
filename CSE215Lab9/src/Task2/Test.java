/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Abrar
 */
public class Test {
    
    public static void main(String[] args) {
        PartTimeEmployee p=new PartTimeEmployee(4.25,2000.0,"Anisul",28,"Mirpur","IT","DGM");
        FullTimeEmployee e=new FullTimeEmployee(15000,25,"Harun",52,"Senparar","Comatial","AGM");
        
        System.out.println(""+p.toString());
        System.out.println("Sallary: "+p.sallary());
        System.out.println("");
        System.out.println(""+e.toString());
        System.out.println("Sallary: "+e.salary());
        
    }
    
}
