package inheritance.quesAndAns;
/*
 * Write a Java program to demonstrate inheritance by creating classes for Employee,
 *  Manager, and CEO. Use inheritance to extend the properties of the base class to 
 * the subclasses.
 */

public class Employee {
    protected float salary;
    protected String employeePosition;

    public void showSalary(){
        System.out.println(employeePosition + " salary is " + salary);
    }
}

class CEO extends Employee {
    
    public CEO(){
        employeePosition = "CEO";
        salary = 11346.34f;
    }

    
}

class Manager extends Employee {
    public Manager(){
        employeePosition = "Manager";
        salary = 1200.34f;
    }
}
