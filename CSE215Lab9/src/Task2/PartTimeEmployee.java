/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Abrar
 */
public class PartTimeEmployee extends Employee {
    
    double hour;
    double rate;

    public PartTimeEmployee(double hour, double rate, String name, int age, String adress, String department, String designation) {
        super(name, age, adress, department, designation);
        
        this.hour = hour;
        this.rate = rate;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public String toString()
    {
        return ("Name: "+getName()+ "\nAge: "+getAge()+ "\nAdress: "+getAdress()+ "\nDepartment: "+getDepartment()+ "\nDesignation: "+getDesignation());
    }
    
    public double sallary()
    {
        return rate*hour;
    }
    
}
