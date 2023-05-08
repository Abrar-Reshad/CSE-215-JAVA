/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1;

/**
 *
 * @author Abrar
 */
public class Faculty extends Employee{
    String initial;
    String rank;
   
    Faculty(String name,String gender,int age,int id,String d,double s,String i,String r)
    {
        super(name,gender,age,id,d,s);
        initial=i; 
        rank=r;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
    
    public String toString()
    {
        return ("Initial: "+getInitial() + "\nRank: "+getRank());
    }
}
