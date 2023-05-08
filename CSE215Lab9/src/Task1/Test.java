/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1;

/**
 *
 * @author Abrar
 */
public class Test {
    public static void main(String[] args) {
       Faculty f=new Faculty ("Mahboob Shaheen","Male",45,212233,"ECE",200000.0,"MS1","Proffesor");
        System.out.println("Name: "+f.getName());
        System.out.println("Age: "+f.getAge());
        System.out.println("Salary: "+f.getSalary());
       
        
        System.out.println(""+f.toString());
       
                
                
    }
}
