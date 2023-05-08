/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author Abrar
 */
public class FullTimeEmployee extends Employee{
    double basic;
    double allowance;

    public FullTimeEmployee(double basic, double allowance, String name, int age, String adress, String department, String designation) {
        super(name, age, adress, department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    
    public String toString()
    {
        return ("Name: "+getName()+ "\nAge: "+getAge()+ "\nAdress: "+getAdress()+ "\nDepartment: "+getDepartment()+ "\nDesignation: "+getDesignation());
    }
    
    public double salary()
    {
        return basic+(basic*(allowance/100));
    }
    
    
}
