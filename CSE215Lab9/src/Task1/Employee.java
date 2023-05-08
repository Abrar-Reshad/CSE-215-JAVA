/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1;

/**
 *
 * @author Abrar
 */
public class Employee extends Person {
            int id;
            String department;
            double salary;
            
            Employee(String name,String gender,int age,int id,String d,double s)
            {
                super(name,gender,age);
                this.id=id;
                department=d;
                salary=s;
                
            }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
            
    
}
